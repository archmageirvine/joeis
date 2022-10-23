package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A026249 a(n) = j if n = [ j*sqrt(2) ], else a(n) = k if n = [ k*(2 + sqrt(2)) ].
 * @author Sean A. Irvine
 */
public class A026249 extends Sequence1 {

  private long mJ = 1;
  private long mJi = 0;
  private long mNonJi = 0;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mJ) {
      mJ = CR.SQRT2.multiply(mJi + 2).floor().longValueExact();
      return Z.valueOf(++mJi);
    } else {
      return Z.valueOf(++mNonJi);
    }
  }
}
