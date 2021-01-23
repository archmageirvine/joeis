package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026255 Beginning with the natural numbers, swap [ k*sqrt(3) ] and [ (k/2)*(3 + sqrt(3)) ], for all k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A026255 implements Sequence {

  private static final CR SQRT3 = CR.THREE.sqrt();
  private long mA = 0;
  private long mB = 0;
  private long mJ = 1;
  private long mJi = 1;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mJ) {
      mJ = SQRT3.multiply(++mJi).floor().longValueExact();
      return SQRT3.add(CR.THREE).divide(CR.TWO).multiply(++mB).floor();
    } else {
      return SQRT3.multiply(++mA).floor();
    }
  }
}
