package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a001.A001477;

/**
 * A032762.
 * @author Sean A. Irvine
 */
public class A032762 extends A001477 {

  private String mPrev = "";

  @Override
  public Z next() {
    final String s = super.next().toString();
    final Z res = new Z(mPrev + s.charAt(0));
    mPrev = s.substring(1);
    return res;
  }
}
