package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A063095 Record prime gap among first n+1 primes.
 * @author Sean A. Irvine
 */
public class A063095 extends A001223 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.max(super.next());
    return mA;
  }
}
