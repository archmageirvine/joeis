package irvine.oeis.a019;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A019507 Droll numbers: sum of even prime divisors equals sum of odd prime divisors.
 * @author Sean A. Irvine
 */
public class A019507 extends Sequence1 {

  private long mN = 70;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final FactorSequence fs = Jaguar.factor(mN);
      final long target = 2 * fs.getExponent(Z.TWO);
      long sum = 0;
      for (final Z p : fs.toZArray()) {
        if (p.isOdd()) {
          sum += p.longValueExact() * fs.getExponent(p);
          if (sum > target) {
            break;
          }
        }
      }
      if (sum == target) {
        return Z.valueOf(mN);
      }
    }
  }
}
