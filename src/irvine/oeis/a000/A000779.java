package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000779 a(n) = 2*(2n-1)!!-(n-1)!*2^(n-1), where (2n-1)!! is A001147(n).
 * @author Sean A. Irvine
 */
public class A000779 extends Sequence1 {

  private long mN = 0;
  private Z mDF = Z.TWO;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN - 1).multiply2();
      mDF = mDF.multiply(2 * mN - 1);
    }
    return mDF.subtract(mF);
  }
}
