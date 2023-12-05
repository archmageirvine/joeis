package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029802 Cubes k such that k^(1/3), k^(2/3) and k all have the same digits.
 * @author Sean A. Irvine
 */
public class A029802 extends A029800 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
