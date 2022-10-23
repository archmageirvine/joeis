package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A026262 Beginning with the natural numbers, swap [ k*sqrt(5) ] and [ (k/4)*(5 + sqrt(5)) ], for all k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A026262 extends Sequence1 {

  private static final CR SQRT5 = CR.FIVE.sqrt();
  private long mA = 0;
  private long mB = 0;
  private long mJ = 2;
  private long mJi = 1;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mJ) {
      mJ = SQRT5.multiply(++mJi).floor().longValueExact();
      return SQRT5.add(CR.FIVE).divide(CR.FOUR).multiply(++mB).floor();
    } else {
      return SQRT5.multiply(++mA).floor();
    }
  }
}
