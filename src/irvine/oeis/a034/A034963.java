package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A034963 Sums of four consecutive primes.
 * @author Sean A. Irvine
 */
public class A034963 extends A000040 {

  private Z mA = super.next();
  private Z mB = super.next();
  private Z mC = super.next();

  @Override
  public Z next() {
    final Z p = mA;
    mA = mB;
    mB = mC;
    mC = super.next();
    return mA.add(mB).add(mC).add(p);
  }
}
