package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a060.A060315;

/**
 * A071819 a(n) is the difference between the two smallest positive integers that you cannot obtain using the integers {1,2,...,n} at most once and the four operators +, -, *, /.
 * @author Sean A. Irvine
 */
public class A071819 extends A060315 {

  @Override
  public Z next() {
    super.next(); // Updates mM
    long q = mM + 1;
    while (mSeen.isSet(q)) {
      ++q;
    }
    return Z.valueOf(q - mM);
  }
}
