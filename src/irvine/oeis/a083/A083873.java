package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a071.A071395;

/**
 * A083873 Primitive abundant numbers that set a new record for number of divisors.
 * @author Sean A. Irvine
 */
public class A083873 extends A071395 {

  private Z mRecord = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Z s = Functions.SIGMA0.z(t);
      if (s.compareTo(mRecord) > 0) {
        mRecord = s;
        return t;
      }
    }
  }
}
