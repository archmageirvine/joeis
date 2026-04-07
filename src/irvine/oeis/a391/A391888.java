package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391888 a(0)=5 and a(n) = n*(a(n-1) + 2) for n &gt; 0.
 * @author Sean A. Irvine
 */
public class A391888 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.FIVE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.add(2).multiply(mN);
    }
    return mA;
  }
}
