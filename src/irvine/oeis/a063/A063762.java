package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a006.A006530;

/**
 * A063762 Sqrt(n)-rough nonprimes: largest prime factor of n (A006530) &gt;= sqrt(n).
 * @author Sean A. Irvine
 */
public class A063762 extends A006530 {

  {
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.square().compareTo(mN) >= 0 && !mN.isProbablePrime()) {
        return mN;
      }
    }
  }
}
