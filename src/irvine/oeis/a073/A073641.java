package irvine.oeis.a073;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073641 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    Z p = Z.ONE;
    while (true) {
      final String s = mA.toString();
      p = mPrime.nextPrime(p);
      if (!mUsed.contains(p) && new Z(s + p).isProbablePrime()) {
        mA = p;
        mUsed.add(p);
        return p;
      }
    }
  }
}
