package irvine.oeis.a054;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054573 Lesser members of g-reduced amicable pairs a &lt; b such that sigma(a) = sigma(b) = a + b + gcd(a,b).
 * @author Sean A. Irvine
 */
public class A054573 extends Sequence1 {

  private final TreeSet<Long> mM = new TreeSet<>();
  private long mN = 181;

  @Override
  public Z next() {
    while (mM.isEmpty()) {
      final FactorSequence a = Jaguar.factor(++mN);
      final Z as = a.sigma();
      for (long k = 1; k < mN; ++k) {
        final FactorSequence b = Jaguar.factor(k);
        if (as.equals(b.sigma()) && as.equals(Z.valueOf(mN + k + Functions.GCD.l(mN, k)))) {
          mM.add(k);
        }
      }
    }
    return Z.valueOf(mM.pollFirst());
  }
}
