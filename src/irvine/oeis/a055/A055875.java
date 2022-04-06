package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000578;
import irvine.oeis.a008.A008578;

/**
 * A055875 a(0)=1, a(n) = prime(n^3).
 * @author Sean A. Irvine
 */
public class A055875 extends A000578 {

  private final Sequence mPrime = new A008578();
  private Z mP = null;
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = super.next();
    while (!mN.equals(t)) {
      mP = mPrime.next();
      mN = mN.add(1);
    }
    return mP;
  }
}
