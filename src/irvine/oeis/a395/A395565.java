package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A395565 allocated for Alain Rocchelli.
 * @author Sean A. Irvine
 */
public class A395565 extends A065091 {

  private boolean is(final Z p) {
    return CR.valueOf(mPrime.nextPrime(p).subtract(mPrime.prevPrime(p))).compareTo(CR.valueOf(p).log().multiply(2)) > 0;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
