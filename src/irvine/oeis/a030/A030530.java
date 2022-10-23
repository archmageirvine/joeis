package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A030530 n appears A070939(n) times.
 * @author Sean A. Irvine
 */
public class A030530 extends Sequence0 {

  private Z mN = Z.ZERO;
  private long mCount = 1;

  @Override
  public Z next() {
    if (--mCount < 0) {
      mN = mN.add(1);
      mCount = mN.bitLength() - 1;
    }
    return mN;
  }
}
