package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063071 Numbers k such that sigma(k)*omega(k) = sigma(k+1)*omega(k+1), where omega(k) is the number of distinct prime divisors of n (A001221).
 * @author Sean A. Irvine
 */
public class A063071 extends Sequence1 {

  private long mN = 13;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z t = mPrev;
      mPrev = fs.sigma().multiply(fs.omega());
      if (t.equals(mPrev)) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
