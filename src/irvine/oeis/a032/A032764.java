package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a005.A005408;

/**
 * A032764.
 * @author Sean A. Irvine
 */
public class A032764 extends A005408 {

  private String mPrev = "";

  @Override
  public Z next() {
    final String s = super.next().toString();
    final Z res = new Z(mPrev + s.charAt(0));
    mPrev = s.substring(1);
    return res;
  }
}
