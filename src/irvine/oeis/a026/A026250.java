package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026250 Beginning with the natural numbers, swap [ k*sqrt(2) ] and [ k*(2 + sqrt(2)) ], for all k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A026250 implements Sequence {

  private long mA = 0;
  private long mB = 0;
  private long mJ = 1;
  private long mJi = 1;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mJ) {
      mJ = CR.SQRT2.multiply(++mJi).floor().longValueExact();
      return CR.SQRT2.add(CR.TWO).multiply(++mB).floor();
    } else {
      return CR.SQRT2.multiply(++mA).floor();
    }
  }
}
