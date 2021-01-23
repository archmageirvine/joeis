package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a005.A005843;

/**
 * A036211 Successive digits of even numbers.
 * @author Sean A. Irvine
 */
public class A036211 extends A005843 {

  private String mS = "";
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN >= mS.length()) {
      mS = super.next().toString();
      mN = 0;
    }
    return Z.valueOf(mS.charAt(mN) - '0');
  }
}
