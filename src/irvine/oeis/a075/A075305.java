package irvine.oeis.a075;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A075245.
 * @author Sean A. Irvine
 */
public class A075305 extends A002808 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z mod = super.next();
    Z p = Z.ONE;
    while (true) {
      p = mPrime.nextPrime(p);
      if (p.mod(mod).equals(Z.ONE) && mSeen.add(p)) {
        return p;
      }
    }
  }
}
