package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a060.A060681;

/**
 * A074844 Largest difference between consecutive divisors of n is equal to the sum of divisors of n except 1 and n.
 * @author Sean A. Irvine
 */
public class A074844 extends A060681 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Functions.ALIQUOT.z(mN).subtract(1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
