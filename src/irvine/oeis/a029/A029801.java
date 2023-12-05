package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029801 Squares k such that sqrt(k), k and k^(3/2) all have the same digits.
 * @author Sean A. Irvine
 */
public class A029801 extends A029800 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return super.next().square();
  }
}
