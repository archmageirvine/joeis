package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069561 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.TWO;
    }
    final Z[] divs = new Z[mN];
    final Z[] mods = new Z[mN];
    Z p = Z.TWO;
    for (int k = 0; k < divs.length; ++k, p = mPrime.nextPrime(p)) {
      mods[k] = p;
      divs[k] = p.subtract(k);
    }
    return ZUtils.chineseRemainderTheorem(divs, mods);
  }
}
