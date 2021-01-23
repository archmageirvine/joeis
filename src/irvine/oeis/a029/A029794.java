package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029794 Squares n such that sqrt(n) and n have the same set of digits.
 * @author Sean A. Irvine
 */
public class A029794 extends A029793 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
