package irvine.oeis.a101;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.graph.Edges;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRing;
import irvine.math.partition.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A101388 Number of n-vertex unlabeled digraphs without endpoints.
 * @author Gregory Morse
 */
public class A101388 extends Sequence0 {
  // After Andrew Howroyd.
  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Edges mEdges;
  private final int mChoices;
  private final Z mOrbitChoices;
  private int mN = -1;

  protected A101388(final Edges edges, final int choices, final int orbitChoices) {
    mEdges = edges;
    mChoices = choices;
    mOrbitChoices = Z.valueOf(orbitChoices);
  }

  /** Construct the sequence. */
  public A101388() {
    this(Edges.DIGRAPH_EDGES, 3, 2);
  }

  private final MemoryFunction1<Z> mCounts = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      Z sum = n < 2 ? Z.ZERO : get(n - 2);
      for (int k = 0; k <= n; ++k) {
        final int degree = n - k;
        final IntegerPartition partitions = new IntegerPartition(k);
        Z fixedSum = Z.ZERO;
        int[] p;
        while ((p = partitions.next()) != null) {
          Polynomial<Z> mark = RING.one();
          for (final int d : p) {
            if (d <= degree) {
              mark = RING.multiply(mark, RING.pow(RING.oneMinusXToTheN(Z.ONE, d), mChoices, degree), degree);
            }
          }
          final Z fixed = mEdges.edges(p, IntegerField.SINGLETON, e -> mOrbitChoices);
          fixedSum = fixedSum.add(IntegerPartition.permCount(p).multiply(fixed).multiply(mark.coeff(degree)));
        }
        sum = sum.add(fixedSum.divide(Functions.FACTORIAL.z(k)));
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    return mCounts.get(++mN);
  }
}
