package irvine.oeis.a391;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a001.A001694;

/**
 * A391491 Powerful numbers that are both divisible by only one prime cube and have more than 1 distinct prime factor.
 * @author Sean A. Irvine
 */
public class A391491 extends A001694 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final FactorSequence fs = Jaguar.factor(n);
      if (fs.omega() > 1 && fs.maxExponent() >= 3) {
        int cnt = 0;
        for (final Z p : fs.toZArray()) {
          if (fs.getExponent(p) >= 3 && ++cnt > 1) {
            break;
          }
        }
        if (cnt == 1) {
          return n;
        }
      }
    }
  }
}
