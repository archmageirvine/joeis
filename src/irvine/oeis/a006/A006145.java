package irvine.oeis.a006;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006145 Ruth-Aaron numbers (1): sum of prime divisors of n = sum of prime divisors of n+1.
 * @author Sean A. Irvine
 */
public class A006145 extends Sequence1 {

  private long mN = 4;
  private long mSum = 2;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      long s = 0;
      for (final Z p : fs.toZArray()) {
        s += p.longValue();
      }
      final boolean res = mSum == s;
      mSum = s;
      if (res) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
