package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A057467 GCD of n-th and (n+1)-st term in the sequence of first differences between primes, A001223.
 * @author Sean A. Irvine
 */
public class A057467 extends A001223 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return t.gcd(mA);
  }
}
