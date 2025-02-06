package irvine.oeis.a074;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A053188.
 * @author Sean A. Irvine
 */
public class A074998 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (FactorUtils.leastPrimeSignature(c.subtract(1)).equals(FactorUtils.leastPrimeSignature(c.add(1)))) {
        return c;
      }
    }
  }
}

