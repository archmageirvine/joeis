package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067293 Numbers n such that prime(n+1)-(n+1)*tau(n+1)=prime(n)-n*tau(n) where tau(n) is the number of divisors of n A000005(n).
 * @author Sean A. Irvine
 */
public class A067293 extends A000040 {

  private long mN = 1;
  private Z mA = super.next().subtract(1);

  @Override
  public Z next() {
    while (true) {
      final Z a = mA;
      mA = super.next().subtract(Jaguar.factor(++mN).sigma0().multiply(mN));
      if (a.equals(mA)) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
