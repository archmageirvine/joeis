package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A004139 Odd primes excluding 5.
 * @author Sean A. Irvine
 */
public class A004139 extends A065091 {

  @Override
  public Z next() {
    final Z r = super.next();
    if (r.equals(Z.FIVE)) {
      return super.next();
    }
    return r;
  }
}
