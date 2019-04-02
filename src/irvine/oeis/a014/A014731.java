package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014731 Squares of even Lucas numbers.
 * @author Sean A. Irvine
 */
public class A014731 extends A014448 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
