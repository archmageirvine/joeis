package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A034961 Sums of three consecutive primes.
 * @author Sean A. Irvine
 */
public class A034961 extends A000040 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    final Z p = mA;
    mA = mB;
    mB = super.next();
    return mA.add(mB).add(p);
  }
}
