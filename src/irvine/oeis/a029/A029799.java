package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029799 Cubes such that <code>n^(2/3)</code> and n have same digits.
 * @author Sean A. Irvine
 */
public class A029799 extends A029797 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
