package irvine.oeis.a054;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054744 p-full numbers: numbers such that if any prime p divides it, then so does p^p.
 * @author Sean A. Irvine
 */
public class A054744 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ONE);
  }
  private long mP = 2;
  private Z mN = Z.FOUR; // 2^2

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mN) > 0) {
      mA.add(mN);
      mP = mPrime.nextPrime(mP);
      mN = Z.valueOf(mP).pow(mP);
    }
    final Z res = mA.pollFirst();
    for (long q = 2; q < mP; q = mPrime.nextPrime(q)) {
      if (res.mod(q) == 0) {
        mA.add(res.multiply(q)); // existing prime divisors
      } else {
        mA.add(res.multiply(Z.valueOf(q).pow(q))); // new divisor with minimum power
      }
    }
    return res;
  }
}
