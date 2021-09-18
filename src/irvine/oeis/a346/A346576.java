package irvine.oeis.a346;

import irvine.math.z.Z;
import irvine.oeis.a052.A052382;

/**
 * A346576 Let x run through the list of numbers with no zeros (A052382); replace each digit d of x by the digit (x mod d).
 * @author Sean A. Irvine
 */
public class A346576 extends A052382 {

  @Override
  public Z next() {
    final Z n = super.next();
    final String s = n.toString();
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < s.length(); ++k) {
      sb.append(n.mod(s.charAt(k) - '0'));
    }
    return new Z(sb);
  }
}
