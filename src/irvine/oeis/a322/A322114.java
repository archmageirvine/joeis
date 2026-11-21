package irvine.oeis.a322;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a339.A339063;

/**
 * A322114 Regular triangle read by rows where T(n,k) is the number of unlabeled connected graphs with loops with n edges and k vertices, 1 &lt;= k &lt;= n+1.
 * @author Gregory Morse
 */
public class A322114 extends A339063 {
  private static final PolynomialRingField<Q> Y = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> VERTICES = new PolynomialRingField<>(Y);
  private final boolean mLoops;
  private final boolean mParallel;
  private int mMaxVertices = 0;
  private int mMaxEdges = -1;
  private Polynomial<Polynomial<Q>> mConnected = VERTICES.zero();
  private int mN = -1;
  private int mK = 0;

  protected A322114(final boolean loops, final boolean parallel) {
    mLoops = loops;
    mParallel = parallel;
  }

  /** Construct the sequence. */
  public A322114() {
    this(true, false);
  }

  @Override
  protected boolean hasLoops() {
    return mLoops;
  }

  @Override
  protected Polynomial<Z> edgeOrbit(final int size, final int degreeLimit) {
    return mParallel ? RING.series(RING.one(), RING.oneMinusXToTheN(Z.ONE, size), degreeLimit) : super.edgeOrbit(size, degreeLimit);
  }

  protected final void prepare(final int vertices, final int edges) {
    if (vertices <= mMaxVertices && edges <= mMaxEdges) {
      return;
    }
    mMaxVertices = Math.max(mMaxVertices, vertices);
    mMaxEdges = Math.max(mMaxEdges, edges);
    final Polynomial<Polynomial<Q>> all = VERTICES.empty();
    all.add(Y.one());
    for (int n = 1; n <= mMaxVertices; ++n) {
      final Polynomial<Q> row = Y.empty();
      for (final Z count : unrootedCounts(n, mMaxEdges)) {
        row.add(new Q(count));
      }
      all.add(row);
    }
    mConnected = PolynomialUtils.inverseEuler(Y, all);
  }

  protected final Z connected(final int vertices, final int edges) {
    return mConnected.coeff(vertices).coeff(edges).toZ();
  }

  @Override
  public Z next() {
    if (++mK > mN + 1) {
      ++mN;
      mK = 1;
      prepare(mN + 1, mN);
    }
    return connected(mK, mN);
  }
}
