package irvine.oeis.a285;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A285012 Irregular triangle read by rows: T(n,k) is the number of periodic palindromic structures of length n using exactly k different symbols, 1 &lt;= k &lt;= n/2 + 1.
 * @author Sean A. Irvine
 */
public class A285012 extends A285037 {

  private int mN = 0;
  private int mM = 1;

  protected Z t(final Integer n, final Integer k) {
    return Integers.SINGLETON.sumdiv(n, d -> get(d, k));
  }

  @Override
  public Z next() {
    if (++mM > mN / 2 + 1) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
