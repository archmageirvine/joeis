package irvine.oeis.a082;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A082884 a(n) = smallest prime p for which (r-p)/log(p) &lt; 1/n, where r is the next prime after p.
 * @author Sean A. Irvine
 */
public class A082884 extends A000040 {

  private Z mP = super.next();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      final Z q = mPrime.nextPrime(mP);
      if (CR.valueOf(q.subtract(mP).multiply(mN)).compareTo(CR.valueOf(mP).log()) < 0) {
        return mP;
      }
      mP = super.next();
    }
  }
}
