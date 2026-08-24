package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086350 Square array of Pell related numbers, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A086350 extends Sequence0 {

  private static final CR S1 = CR.SQRT2.add(1);
  private static final CR S2 = CR.ONE.subtract(CR.SQRT2);
  private static final CR S8 = CR.SQRT2.multiply(2);
  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long k) {
    return S1.multiply(CR.SQRT2.add(k).pow(n)).subtract(S2.multiply(CR.valueOf(k).subtract(CR.SQRT2).pow(n))).divide(S8).round();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}
