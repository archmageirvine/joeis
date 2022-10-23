package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A026261 a(n) = j if n = [ j*sqrt(5) ], else a(n) = k if n = [ (k/4)*(5 + sqrt(5)) ].
 * @author Sean A. Irvine
 */
public class A026261 extends Sequence1 {

  private static final CR SQRT5 = CR.FIVE.sqrt();
  private long mJ = 1;
  private long mJi = 0;
  private long mNonJi = 0;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mJ) {
      mJ = SQRT5.multiply(mJi + 2).floor().longValueExact();
      return Z.valueOf(++mJi);
    } else {
      return Z.valueOf(++mNonJi);
    }
  }
}
