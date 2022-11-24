package irvine.oeis.a133;

import irvine.math.z.Z;
import irvine.oeis.a001.A001147;

/**
 * A133221 A001147 with each term repeated.
 * @author Georg Fischer
 */
public class A133221 extends A001147 {

  private int mN = -1;
  private Z mA;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 0) {
      mA = super.next();
    }
    return mA;
  }
}
