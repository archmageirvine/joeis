package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063684 Numbers n such that m(n!) = 2, where m(n) = mu(n) + mu(n+1) + mu(n+2).
 * @author Sean A. Irvine
 */
public class A063684 extends Sequence1 {

  private long mN = 7;
  private Z mF = Z.valueOf(5040);

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      if (Jaguar.factor(mF.add(1)).mobius() == 1 && Jaguar.factor(mF.add(2)).mobius() == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
