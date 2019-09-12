package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025715 Index of <code>6^n</code> in <code>A025622</code> (numbers of form <code>5^i*6^j)</code>.
 * @author Sean A. Irvine
 */
public class A025715 extends A025622 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(super.next()));
    mA = mA.multiply(6);
    return Z.valueOf(mN);
  }
}
