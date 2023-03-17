package irvine.oeis.a080;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a020.A020639;

/**
 * A080864 Numbers n such that spf(n)+2 = spf(n-2), where spf=A020639 (smallest prime factor).
 * @author Georg Fischer
 */
public class A080864 extends A020639 {

  protected long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Jaguar.factor(mN).leastPrimeFactor().add(2).equals(Jaguar.factor(mN - 2).leastPrimeFactor())) {
        return Z.valueOf(mN);
      }
    }
  }
}
