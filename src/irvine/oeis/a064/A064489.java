package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000720;

/**
 * A064489 Let p = prime(n); a(n) = smallest m such that prime(m) has p digits.
 * @author Sean A. Irvine
 */
public class A064489 extends A000040 {

  private final Sequence mPrimePi = new A000720();
  private Z mM = Z.ZERO;

  @Override
  public Z next() {
    final Z p = mPrime.nextPrime(Z.TEN.pow(super.next().subtract(1)));
    while (mM.compareTo(p) < 0) {
      mM = mM.add(1);
      mPrimePi.next();
    }
    mM = mM.add(1);
    return mPrimePi.next();
  }
}
