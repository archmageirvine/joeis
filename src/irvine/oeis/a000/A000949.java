package irvine.oeis.a000;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000949 Number of forests with n nodes and height at most 2.
 * @author Sean A. Irvine
 */
public class A000949 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000949(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000949() {
    super(0);
  }

  protected int mN = -1;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ONE;
    final Z fn = mF.factorial(mN);
    for (int m = 1; m < mN; ++m) {
      final Z r = fn.divide(mF.factorial(m));
      Z mp = Z.ONE;
      for (int k = 1; k <= mN - m; ++k) {
        mp = mp.multiply(m);
        final Z kp = Z.valueOf(k).pow(mN - m - k);
        s = s.add(mp.multiply(kp).multiply(r).divide(mF.factorial(k)).divide(mF.factorial(mN - m - k)));
      }
    }
    return s;
  }
}
