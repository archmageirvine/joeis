package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A072562 Smallest of exactly n consecutive integers divisible respectively by the first n primes.
 * @author Sean A. Irvine
 */
public class A072562 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return mN == 1 ? Z.FOUR : Z.TWO;
    }
    final Z[] divs = new Z[mN];
    final Z[] mods = new Z[mN];
    Z prod = Z.ONE;
    Z p = Z.TWO;
    for (int k = 0; k < divs.length; ++k, p = mPrime.nextPrime(p)) {
      mods[k] = p;
      divs[k] = p.subtract(k);
      prod = prod.multiply(p);
    }
    Z t = ZUtils.chineseRemainderTheorem(divs, mods);
    while (t.add(mN).mod(p).isZero()) {
      t = t.add(prod);
    }
    return t;
  }
}
