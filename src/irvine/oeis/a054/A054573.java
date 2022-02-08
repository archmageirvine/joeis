package irvine.oeis.a054;

import java.util.TreeSet;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054573 Lesser members of g-reduced amicable pairs a &lt; b such that sigma(a) = sigma(b) = a + b + gcd(a,b).
 * @author Sean A. Irvine
 */
public class A054573 implements Sequence {

  private final TreeSet<Long> mM = new TreeSet<>();
  private long mN = 181;

  @Override
  public Z next() {
    while (mM.isEmpty()) {
      final FactorSequence a = Cheetah.factor(++mN);
      final Z as = a.sigma();
      for (long k = 1; k < mN; ++k) {
        final FactorSequence b = Cheetah.factor(k);
        if (as.equals(b.sigma()) && as.equals(Z.valueOf(mN + k + LongUtils.gcd(mN, k)))) {
          mM.add(k);
        }
      }
    }
    return Z.valueOf(mM.pollFirst());
  }
}
