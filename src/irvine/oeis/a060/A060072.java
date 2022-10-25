package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060072 a(n) = (n^(n-1) - 1)/(n-1) for n&gt;1, a(1) = 0.
 * @author Sean A. Irvine
 */
public class A060072 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    return Z.valueOf(mN).pow(mN - 1).subtract(1).divide(mN - 1);
  }
}
