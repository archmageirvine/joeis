package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068762 Alternating sum sigma(1)-sigma(2)+sigma(3)-sigma(4)+...+((-1)^(n+1))*sigma(n).
 * @author Sean A. Irvine
 */
public class A068762 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mSum = mSum.signedAdd((++mN & 1) == 1, Functions.SIGMA1.z(mN));
    return mSum;
  }
}
