package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a000.A000578;

/**
 * A032761 Take list of cubes, move left digit of each term to end of previous term.
 * @author Sean A. Irvine
 */
public class A032761 extends A000578 {

  private String mPrev = "";

  @Override
  public Z next() {
    final String s = super.next().toString();
    final Z res = new Z(mPrev + s.charAt(0));
    mPrev = s.substring(1);
    return res;
  }
}
