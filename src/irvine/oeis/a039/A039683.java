package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A039683 Signed double Pochhammer triangle: expansion of x(x-2)(x-4)..(x-2n+2).
 * @author Sean A. Irvine
 */
public class A039683 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A039683() {
    super(1);
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m <= 0 || m > n) {
      return Z.ZERO;
    }
    if (n == 1) {
      return Z.ONE;
    }
    return get(n - 1, m - 1).subtract(get(n - 1, m).multiply(2 * mN - 2));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
