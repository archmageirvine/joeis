package irvine.oeis.a083;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083772 Primes arising in A083771.
 * @author Sean A. Irvine
 */
public class A083772 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.THREE;
    }
    long p = 2;
    while (true) {
      p = mPrime.nextPrime(p);
      if (!mUsed.contains(p)) {
        final Z u = mA.multiply(p);
        final Z v = u.add(1);
        if (v.isProbablePrime()) {
          mUsed.add(p);
          mA = u;
          return v;
        }
      }
    }
  }
}
