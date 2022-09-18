package irvine.oeis.a059;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059267 Numbers n with 2 divisors d1 and d2 having difference 2: d2 - d1 = 2; equivalently, numbers that are 0 (mod 4) or have a divisor d of the form d = m^2 - 1.
 * @author Sean A. Irvine
 */
public class A059267 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      for (final Z d : Jaguar.factor(++mN).divisors()) {
        if (mN % (d.longValue() + 2) == 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
