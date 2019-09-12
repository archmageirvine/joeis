package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a003.A003595;

/**
 * A025708 Index of <code>5^n</code> within sequence of numbers of form <code>5^i*7^j</code>.
 * @author Sean A. Irvine
 */
public class A025708 extends A003595 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(super.next()));
    mA = mA.multiply(5);
    return Z.valueOf(mN);
  }
}
