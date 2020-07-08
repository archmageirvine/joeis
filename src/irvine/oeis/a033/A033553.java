package irvine.oeis.a033;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033553 <code>3-Kn\u00f6del</code> numbers or <code>D-numbers</code>: numbers <code>n &gt; 3</code> such that <code>n | k^(n-2)-k</code> for all k with <code>gcd(k, n) = 1</code>.
 * @author Sean A. Irvine
 */
public class A033553 implements Sequence {

  // After Max Alekseyev

  private long mN = 7;

  private boolean isA033553(final long n) {
    final FactorSequence fs = Cheetah.factor(n);
    for (final Z pp : fs.toZArray()) {
      if ((n - 3) % Euler.phi(pp.pow(fs.getExponent(pp))).longValueExact() != 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (isA033553(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
