package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a005.A005843;

/**
 * A032763 Take list of even numbers, move left digit of each term to end of previous term.
 * @author Sean A. Irvine
 */
public class A032763 extends A005843 {

  private String mPrev = "";

  @Override
  public Z next() {
    final String s = super.next().toString();
    final Z res = new Z(mPrev + s.charAt(0));
    mPrev = s.substring(1);
    return res;
  }
}
