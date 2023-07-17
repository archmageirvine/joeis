package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025694 Index of 2^n within sequence of numbers of form 2^i * 9^j.
 * @author Sean A. Irvine
 */
public class A025694 extends A025611 {

  /** Construct the sequence. */
  public A025694() {
    super(0);
  }

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(super.next()));
    mA = mA.multiply2();
    return Z.valueOf(mN);
  }
}
