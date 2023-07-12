package irvine.oeis.a057;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt2Sequence;
import irvine.util.Pair;

/**
 * A057623 a(n) = n! * (sum of reciprocals of all parts in unrestricted partitions of n).
 * @author Sean A. Irvine
 */
public class A057623 extends MemoryFunctionInt2Sequence<Pair<Q, Q>> {

  /** Construct the sequence. */
  public A057623() {
    super(1);
  }

  private static final Pair<Q, Q> ZERO = new Pair<>(Q.ZERO, Q.ZERO);
  private static final Pair<Q, Q> ONE = new Pair<>(Q.ONE, Q.ZERO);
  private int mN = 0;

  @Override
  protected Pair<Q, Q> compute(final int n, final int i) {
    if (n == 0) {
      return ONE;
    }
    if (i < 1) {
      return ZERO;
    }
    final Pair<Q, Q> a = get(n, i - 1);
    if (i > n) {
      return a;
    }
    final Pair<Q, Q> b = get(n - i, i);
    return new Pair<>(a.left().add(b.left()), a.right().add(b.right()).add(b.left().divide(i)));
  }

  @Override
  public Z next() {
    return get(++mN, mN).right().multiply(MemoryFactorial.SINGLETON.factorial(mN)).toZ();
  }
}
