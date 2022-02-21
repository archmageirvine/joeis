package irvine.oeis.a054;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054743 If n = Product p_i^e_i then p_i &lt; e_i (where e_i &gt; 0) for all i.
 * @author Sean A. Irvine
 */
public class A054743 implements Sequence {

  private final Fast mPrime = new Fast();
  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ONE);
  }
  private long mP = 2;
  private Z mN = Z.EIGHT; // 2^3

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mN) > 0) {
      mA.add(mN);
      mP = mPrime.nextPrime(mP);
      mN = Z.valueOf(mP).pow(mP + 1);
    }
    final Z res = mA.pollFirst();
    for (long q = 2; q < mP; q = mPrime.nextPrime(q)) {
      if (res.mod(q) == 0) {
        mA.add(res.multiply(q)); // existing prime divisors
      } else {
        mA.add(res.multiply(Z.valueOf(q).pow(q+1))); // new divisor with minimum power
      }
    }
    return res;
  }
}
