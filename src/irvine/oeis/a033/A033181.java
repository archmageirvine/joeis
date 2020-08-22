package irvine.oeis.a033;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033181 Absolute Euler pseudoprimes: odd composite numbers n such that a^((n-1)/2) == +-1 (mod n) for every a coprime to n.
 * @author Sean A. Irvine
 */
public class A033181 implements Sequence {

  private Z mN = Z.valueOf(1725);

  private boolean is(final Z t, final Z[] primes) {
    for (final Z p : primes) {
      if (!Z.ZERO.equals(t.mod(p.subtract(1)))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(4);
      if (mN.isProbablePrime()) {
        continue;
      }
      final FactorSequence fs = Cheetah.factor(mN);
      if (!fs.isSquareFree()) {
        continue;
      }
      if (is(mN.subtract(1).divide2(), fs.toZArray())) {
        return mN;
      }
    }
  }
}
