package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054572 Larger members of g-reduced amicable pairs a &lt; b such that sigma(a) = sigma(b) = a + b + gcd(a,b).
 * @author Sean A. Irvine
 */
public class A054572 extends Sequence1 {

  private long mM = 0;
  private long mN = 181;

  @Override
  public Z next() {
    while (mM == 0) {
      final FactorSequence a = Jaguar.factor(++mN);
      final Z as = a.sigma();
      for (long k = 1; k < mN; ++k) {
        final FactorSequence b = Jaguar.factor(k);
        if (as.equals(b.sigma()) && as.equals(Z.valueOf(mN + k + Functions.GCD.l(mN, k)))) {
          ++mM;
        }
      }
    }
    --mM;
    return Z.valueOf(mN);
  }
}
