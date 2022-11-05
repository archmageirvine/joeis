package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060258 Numbers k such that 1/prime(k) has period prime(k) - 1 and 1/prime(k+1) has period prime(k+1) - 1.
 * @author Sean A. Irvine
 */
public class A060258 extends A060257 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (Z.ONE.equals(mA.subtract(t))) {
        return t;
      }
    }
  }
}
