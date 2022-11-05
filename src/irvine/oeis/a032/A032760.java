package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A032760 Take list of squares, move left digit of each term to end of previous term.
 * @author Sean A. Irvine
 */
public class A032760 extends A000290 {

  private String mPrev = "";
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    final String s = super.next().toString();
    final Z res = new Z(mPrev + s.charAt(0));
    mPrev = s.substring(1);
    return res;
  }
}
