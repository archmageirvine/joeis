package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a014.A014076;

/**
 * A062532 Odd nonprimes squared, or A014076(n)^2.
 * @author Sean A. Irvine
 */
public class A062532 extends A014076 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
