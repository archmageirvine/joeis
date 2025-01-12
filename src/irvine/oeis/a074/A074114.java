package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074114 Largest n-digit number of the form p^a*q^b... with the maximum value of a+b+.... where p, q etc. are primes.
 * @author Sean A. Irvine
 */
public class A074114 extends Sequence1 {

  private Z mMax = Z.ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mMax = mMax.multiply(10);
    while (mA.compareTo(mMax) <= 0) {
      mA = mA.multiply2();
    }
    final Z t = mA.divide2();
    final Z u = t.divide2().multiply(3);
    return u.compareTo(mMax) <= 0 ? u : t;
  }
}
