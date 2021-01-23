package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A038457 |First digit-last digit| for triangular numbers.
 * @author Sean A. Irvine
 */
public class A038457 extends A000217 {

  @Override
  public Z next() {
    final String t = super.next().toString();
    return Z.valueOf(Math.abs(t.charAt(0) - t.charAt(t.length() - 1)));
  }
}
