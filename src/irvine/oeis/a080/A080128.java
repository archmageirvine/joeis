package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A080128 Number of primes less than n*10^19.
 * @author Sean A. Irvine
 */
public class A080128 extends A000720 {

  // Too slow to be useful
  private static final Z LIM = new Z("9999999999999999999");

  @Override
  public Z next() {
    for (Z k = Z.ZERO; k.compareTo(LIM) < 0; k = k.add(1)) {
      super.next();
    }
    return super.next();
  }
}
