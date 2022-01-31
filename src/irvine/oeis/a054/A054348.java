package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a042.A042942;

/**
 * A054348 Triangular array whose rows are successive generations of the variant of the Kolakoski sequence described in A042942.
 * @author Sean A. Irvine
 */
public class A054348 extends A042942 {

  private long mM = 0;

  @Override
  public Z next() {
    if (++mM == mLimit) {
      super.next();
      mM = 0;
    }
    return ((mSeq.get(mM >>> 5) >>> (mM & 0x1F)) & 1) == 0 ? Z.ONE : Z.TWO;
  }
}
