package irvine.oeis.a086;

import irvine.math.z.Z;

/**
 * A086097 Numbers n such that n and n+1 are semiprimes with a semiprime number of 1's in their binary representation.
 * @author Sean A. Irvine
 */
public class A086097 extends A086096 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.subtract(t).isOne()) {
        return t;
      }
    }
  }
}
