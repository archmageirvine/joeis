package irvine.oeis.a039;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039743 Number k such that gcd(phi(k), k-1) = number of distinct prime factors of k.
 * @author Sean A. Irvine
 */
public class A039743 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Functions.GCD.l(fs.phi(), mN - 1) == fs.omega()) {
        return Z.valueOf(mN);
      }
    }
  }
}
