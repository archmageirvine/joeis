package irvine.oeis.a083;

import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083862 Main diagonal of array A083857.
 * @author Sean A. Irvine
 */
public class A083862 extends Sequence0 {

  private static final SeriesRing<Z> SZ = SeriesRing.SZ;
  private int mN = -1;

  @Override
  public Z next() {
    return SZ.divide(SZ.x(), SZ.create(Z.ONE, Z.valueOf(-3), Z.valueOf(2 - ++mN))).coeff(mN);
  }
}
