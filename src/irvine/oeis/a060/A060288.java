package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a005.A005349;

/**
 * A060288 Distinct (non-overlapping) twin Harshad numbers whose sum is prime.
 * @author Sean A. Irvine
 */
public class A060288 extends A005349 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.subtract(t).equals(Z.ONE)) {
        final Z u = mA.add(t);
        mA = super.next(); // Avoid overlaps
        if (u.isProbablePrime()) {
          return u;
        }
      }
    }
  }
}
