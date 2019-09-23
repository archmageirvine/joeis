package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026249 <code>a(n) =</code> j if <code>n = [ j*sqrt(2) ]</code>, else <code>a(n) =</code> k if <code>n = [ k*(2 + sqrt(2)) ]</code>.
 * @author Sean A. Irvine
 */
public class A026249 implements Sequence {

  private long mJ = 1;
  private long mJi = 0;
  private long mNonJi = 0;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mJ) {
      mJ = CR.SQRT2.multiply(CR.valueOf(mJi + 2)).floor().longValueExact();
      return Z.valueOf(++mJi);
    } else {
      return Z.valueOf(++mNonJi);
    }
  }
}
