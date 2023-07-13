package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063684 Numbers k such that m(k!) = 2, where m(k) = mu(k) + mu(k+1) + mu(k+2).
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
