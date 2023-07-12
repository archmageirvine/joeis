package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A010094 Triangle of Euler-Bernoulli or Entringer numbers.
 * @author Sean A. Irvine
 */
public class A010094 extends MemoryFunction2Sequence<Integer, Z> {

  /** Construct the sequence. */
  public A010094() {
    super(1);
  }

  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (k == 0) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    return get(n, k - 1).add(get(n - 1, n - k));
  }

  @Override
  public Z next() {
    if (--mM <= 0) {
      mM = ++mN;
    }
    return get(mN, mM);
  }
}
