package irvine.oeis.a057;

import java.util.HashMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a005.A005351;
import irvine.oeis.a005.A005352;

/**
 * A057894 Negabinary numbral "primes".
 * @author Sean A. Irvine
 */
public class A057894 extends Sequence0 {

  private long mN = -1;
  private long mR = -1;
  private final Sequence mNonNeg = new A005351();
  private final Sequence mNeg = new A005352();
  private final HashMap<Long, Long> mToNatural = new HashMap<>();
  private final Fast mPrime = new Fast();

  private void step() {
    ++mR;
    final long nb = mNonNeg.next().longValueExact();
    mToNatural.put(nb, mR);
    final long nnb = mNeg.next().longValueExact();
    mToNatural.put(nnb, -mR - 1);
  }

  private long getNatural(final long n) {
    while (!mToNatural.containsKey(n)) {
      step();
    }
    return mToNatural.get(n);
  }

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(Math.abs(getNatural(++mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}

