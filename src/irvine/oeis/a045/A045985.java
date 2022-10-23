package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007504;

/**
 * A045985 a(n) = least k such that sum of first k primes is n times a prime.
 * @author Sean A. Irvine
 */
public class A045985 extends Sequence1 {

  private final MemorySequence mSumP = MemorySequence.cachedSequence(new A007504());
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    int k = -1;
    while (true) {
      final Z s = mSumP.a(++k);
      final Z[] qr = s.divideAndRemainder(mN);
      if (qr[1].isZero() && qr[0].isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
