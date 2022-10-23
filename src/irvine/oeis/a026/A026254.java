package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A026254 a(n) = j if n = [ j*sqrt(3) ], else a(n) = k if n = [ (k/2)*(3 + sqrt(3)) ].
 * @author Sean A. Irvine
 */
public class A026254 extends Sequence1 {

  private static final CR SQRT3 = CR.THREE.sqrt();
  private long mJ = 1;
  private long mJi = 0;
  private long mNonJi = 0;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mJ) {
      mJ = SQRT3.multiply(mJi + 2).floor().longValueExact();
      return Z.valueOf(++mJi);
    } else {
      return Z.valueOf(++mNonJi);
    }
  }
}
