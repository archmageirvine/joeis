package irvine.oeis.a039;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A039960 For n &gt;= 2, a(n) = largest value of k such that n^k is &lt;= n! (a(0) = a(1) = 1 by convention).
 * @author Sean A. Irvine
 */
public class A039960 extends Sequence0 {

  protected long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return CR.valueOf(mF).log().divide(CR.valueOf(mN).log()).floor();
  }
}

