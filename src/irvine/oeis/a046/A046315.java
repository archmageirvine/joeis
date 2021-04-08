package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046315 Odd semiprimes: odd numbers divisible by exactly 2 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046315 implements Sequence {

  private Z mN = Z.SEVEN;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      final int s = Cheetah.factor(mN).isSemiprime();
      if (s == FactorSequence.UNKNOWN) {
        throw new UnsupportedOperationException();
      }
      if (s == FactorSequence.YES) {
        return mN;
      }
    }
  }
}
