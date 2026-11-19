package irvine.oeis.a304;

import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.GraphCycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A304070 Number of simple graphs with n vertices rooted at a pair of distinguished vertices.
 * @author Gregory Morse
 */
public class A304070 extends Sequence1 {
  private static final Pair<String, Integer> FIXED_POINTS = new Pair<>(MultivariateMonomial.DEFAULT_VARIABLE, 1);
  private static final Pair<String, Integer> TRANSPOSITIONS = new Pair<>(MultivariateMonomial.DEFAULT_VARIABLE, 2);
  private final boolean mOrdered;
  private int mN = 0;

  protected A304070(final boolean ordered) {
    mOrdered = ordered;
  }

  /** Construct the sequence. */
  public A304070() {
    this(true);
  }

  protected CycleIndex cycleIndex(final int n) {
    return GraphCycleIndex.cycleIndex(n);
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    Q sum = Q.ZERO;
    for (final MultivariateMonomial m : cycleIndex(mN).values()) {
      final long fixed = m.get(FIXED_POINTS).longValueExact();
      final long ordered = fixed * (fixed - 1);
      // An unordered pair may also be fixed by interchanging its two vertices.
      final long pairs = mOrdered ? ordered : ordered / 2 + m.get(TRANSPOSITIONS).longValueExact();
      sum = sum.add(m.getCoefficient().multiply(pairs));
    }
    return sum.toZ();
  }
}
