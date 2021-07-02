package irvine.oeis.a345;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A345404 a(n) is the smallest positive integer k such that |tan(k)-round(tan(k))| is smaller than 10^(-n), but greater than 10^(-n-1).
 * @author Sean A. Irvine
 */
public class A345404 implements Sequence {

  private CR mHi = CR.ONE;

  @Override
  public Z next() {
    mHi = mHi.divide(CR.TEN);
    final CR lo = mHi.divide(CR.TEN);
    long k = 1;
    while (true) {
      final CR kz = CR.valueOf(++k);
      final CR tan = ComputableReals.SINGLETON.tan(kz);
      final CR t = tan.subtract(CR.valueOf(tan.round())).abs();
      if (t.compareTo(lo) > 0 && t.compareTo(mHi) < 0) {
        return Z.valueOf(k);
      }
    }
  }
}
