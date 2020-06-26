package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a001.A001477;

/**
 * A032762 Take list of integers <code>n &gt;= 0</code>, move left digit of each term to end of previous term.
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
