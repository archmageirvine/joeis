package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014725 Squares of odd elements in Pascal triangle that are not 1.
 * @author Sean A. Irvine
 */
public class A014725 extends A014414 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
