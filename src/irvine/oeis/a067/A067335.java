package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067335 Numbers n such that prime(n+1)-(n+1)*tau(n+1)=prime(n-1)-(n-1)*tau(n-1) where tau(n) is the number of divisors of n A000005(n).
 * @author Sean A. Irvine
 */
public class A067335 extends A000040 {

  private long mN = 2;
  private Z mP = super.next();
  private Z mQ = super.next();
  private Z mS = Z.ZERO;
  private Z mT = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z r = mP;
      mP = mQ;
      mQ = super.next();
      final Z u = mS;
      mS = mT;
      mT = Jaguar.factor(++mN).sigma0().multiply(mN);
      if (mQ.subtract(mT).equals(r.subtract(u))) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}

