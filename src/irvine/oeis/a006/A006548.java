package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006548 (2*n)!-Sum ((-1)^(i+1)*binomial(n,i)*2^i*(2*n-1)!,i=1..n).
 * @author Sean A. Irvine
 */
public class A006548 extends Sequence1 {

  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(2L * mN - 1).multiply(2L * mN - 2);
    }
    return mF.multiply(mN / 2).multiply(4);
  }
}
