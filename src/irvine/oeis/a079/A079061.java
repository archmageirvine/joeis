package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079061 Smallest prime p such that the least positive primitive root of p equals prime(n).
 * @author Sean A. Irvine
 */
public class A079061 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z q = p;
    while (true) {
      q = mPrime.nextPrime(q);
      if (Functions.LEAST_PRIMITIVE_ROOT.z(q).equals(p)) {
        return q;
      }
    }
  }
}

