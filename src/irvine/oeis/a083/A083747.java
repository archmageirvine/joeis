package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083747 Smallest number m &gt;= 0 such that n followed by m ones yields a prime; a(p) = -1 if no such m exists.
 * @author Sean A. Irvine
 */
public class A083747 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 38) {
      return Z.NEG_ONE;
    }
    long k = 0;
    Z t = Z.valueOf(mN);
    while (!t.isProbablePrime()) {
      ++k;
      t = t.multiply(10).add(1);
    }
    return Z.valueOf(k);
  }
}
