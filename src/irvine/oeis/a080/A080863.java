package irvine.oeis.a080;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080863 Numbers n such that spf(n)-2 = spf(n+2), where spf=A020639 (smallest prime factor).
 * @author Georg Fischer
 */
public class A080863 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Jaguar.factor(mN).leastPrimeFactor().subtract(2).equals(Jaguar.factor(mN + 2).leastPrimeFactor())) {
        return Z.valueOf(mN);
      }
    }
  }
}
