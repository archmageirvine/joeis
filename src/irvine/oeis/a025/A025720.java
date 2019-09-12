package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a003.A003591;

/**
 * A025720 Index of <code>7^n</code> within sequence of numbers of form <code>2^i*7^j</code>.
 * @author Sean A. Irvine
 */
public class A025720 extends A003591 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(super.next()));
    mA = mA.multiply(7);
    return Z.valueOf(mN);
  }
}
