package irvine.oeis.a082;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A082891 Smallest prime p such that q = (r-p)/log(p) &gt; n, where r is the next prime after p.
 * @author Sean A. Irvine
 */
public class A082891 extends A000040 {

  private int mN = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (CR.valueOf(mPrime.nextPrime(mP).subtract(mP)).compareTo(CR.valueOf(mP).log().multiply(mN)) > 0) {
        return mP;
      }
      super.next();
    }
  }
}
