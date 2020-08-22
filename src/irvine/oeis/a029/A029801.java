package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029801 Squares such that sqrt(n), n and n^(3/2) all have same digits.
 * @author Sean A. Irvine
 */
public class A029801 extends A029800 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
