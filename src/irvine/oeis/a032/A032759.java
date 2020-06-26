package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A032759.
 * @author Sean A. Irvine
 */
public class A032759 extends A000040 {

  private String mPrev = "";

  @Override
  public Z next() {
    final String s = super.next().toString();
    final Z res = new Z(mPrev + s.charAt(0));
    mPrev = s.substring(1);
    return res;
  }
}
