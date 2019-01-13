package irvine.oeis.a006;

import java.io.IOException;
import java.util.HashMap;

import irvine.math.api.Matrix;
import irvine.math.graph.Graph;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixRing;
import irvine.math.group.PolynomialRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006608.
 * @author Sean A. Irvine
 */
public class A006608 implements Sequence, GraphProcessor {

  private static final PolynomialRing<Z> POLY = new PolynomialRing<>(IntegerField.SINGLETON);

  private int mN = 0;
  private MatrixRing<Polynomial<Z>> mRing = null;
  private final HashMap<Polynomial<Z>, Long> mCharPolyCounts = new HashMap<>();

  private Polynomial<Z> characteristicPolynomial(final Graph graph) {
    final Matrix<Polynomial<Z>> lambda = new DefaultMatrix<>(mN, mN, POLY.zero());
    for (int row = 0; row < mN; ++row) {
      for (int col = 0; col < mN; ++col) {
        final Polynomial<Z> p = new Polynomial<>("x", Z.ZERO, Z.ONE);
        p.add(graph.isAdjacent(row, col) ? Z.NEG_ONE : Z.ZERO); // Add constant term
        if (row == col) {
          p.add(Z.ONE); // Add "x"
        }
        p.fixDegree();
        lambda.set(row, col, p);
      }
    }
    return mRing.det(lambda);
  }

  @Override
  public void process(final Graph graph) throws IOException {
    mCharPolyCounts.merge(characteristicPolynomial(graph), 1L, (x, y) -> x + y);
  }

  protected void init(final GenerateGraphs gg, final int n) {
    gg.setConnectionLevel(0);
    gg.setVertices(n);
    gg.setMinEdges(0);
    gg.setMaxEdges(n * (n - 1));
  }

  protected boolean bipartite() {
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    final GenerateGraphs gg = new GenerateGraphs(1);
    init(gg, mN);
    gg.setProcessor(this);
    gg.sanitizeParams();
    mRing = new MatrixRing<>(mN, POLY);
    mCharPolyCounts.clear();
    try {
      gg.run(bipartite(), false, false, 0, 0);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
    long sumRepeated = 0;
    for (final Long v : mCharPolyCounts.values()) {
      if (v > 1) {
        sumRepeated += v;
      }
    }
    return Z.valueOf(sumRepeated);
  }
}

