package irvine.oeis.a062;

import irvine.math.z.Z;

/**
 * A062120 Numbers k such that k has sqrt(k) as its middle digits.
 * @author Sean A. Irvine
 */
public class A062120 extends A062118 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
