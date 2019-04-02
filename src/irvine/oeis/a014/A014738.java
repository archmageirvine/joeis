package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014738 Squares of even triangular numbers.
 * @author Sean A. Irvine
 */
public class A014738 extends A014494 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().square();
  }
}
