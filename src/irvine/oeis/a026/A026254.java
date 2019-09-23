package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026254 <code>a(n) =</code> j if <code>n = [ j*sqrt(3) ]</code>, else <code>a(n) =</code> k if <code>n = [ (k/2)*(3 + sqrt(3)) ]</code>.
 * @author Sean A. Irvine
 */
public class A026254 implements Sequence {

  private static final CR SQRT3 = CR.THREE.sqrt();
  private long mJ = 1;
  private long mJi = 0;
  private long mNonJi = 0;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mJ) {
      mJ = SQRT3.multiply(CR.valueOf(mJi + 2)).floor().longValueExact();
      return Z.valueOf(++mJi);
    } else {
      return Z.valueOf(++mNonJi);
    }
  }
}
