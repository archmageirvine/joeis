package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A346033.
 * @author Sean A. Irvine
 */
public class A346033 implements Sequence {

  private CR mHi = CR.ONE;

  @Override
  public Z next() {
    mHi = mHi.divide(CR.TEN);
    final CR lo = mHi.divide(CR.TEN);
    long k = 1;
    while (true) {
      final CR kz = CR.valueOf(++k);
      final CR sin = kz.sin();
      final CR t = sin.subtract(CR.valueOf(sin.round())).abs();
      if (t.compareTo(lo) > 0 && t.compareTo(mHi) < 0) {
        return Z.valueOf(k);
      }
    }
  }
}
