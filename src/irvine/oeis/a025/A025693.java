package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a003.A003591;

/**
 * A025693 Index of <code>2^n</code> within sequence of numbers of form <code>2^i*7^j</code>.
 * @author Sean A. Irvine
 */
public class A025693 extends A003591 {

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
