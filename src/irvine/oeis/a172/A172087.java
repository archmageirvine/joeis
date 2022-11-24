package irvine.oeis.a172;

import irvine.math.z.Z;
import irvine.oeis.a001.A001897;

/**
 * A172087 A001897 with terms repeated.
 * @author Georg Fischer
 */
public class A172087 extends A001897 {

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
