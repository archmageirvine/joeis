package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025692 Index of 2^n within sequence of numbers of form 2^i*6^j.
 * @author Sean A. Irvine
 */
public class A025692 extends A025610 {

  /** Construct the sequence. */
  public A025692() {
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
