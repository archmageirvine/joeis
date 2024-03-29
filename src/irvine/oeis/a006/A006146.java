package irvine.oeis.a006;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006146 Sums of prime divisors of Ruth-Aaron numbers (A006145).
 * @author Sean A. Irvine
 */
public class A006146 extends Sequence1 {

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
        return Z.valueOf(mSum);
      }
    }
  }
}
