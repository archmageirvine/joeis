package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029802 Cubes such that n^(1/3), n^(2/3) and n all have same digits.
 * @author Sean A. Irvine
 */
public class A029802 extends A029800 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
