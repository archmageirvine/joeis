package irvine.oeis.a078;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078331 First prime such that p^2==1 (mod n).
 * @author Sean A. Irvine
 */
public class A078331 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.isOne()) {
      return Z.TWO;
    }
    Z p = Z.ONE;
    while (true) {
      p = mPrime.nextPrime(p);
      if (p.modSquare(mN).isOne()) {
        return p;
      }
    }
  }
}

