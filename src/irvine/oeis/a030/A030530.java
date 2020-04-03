package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030530 n appears <code>A070939(n)</code> times.
 * @author Sean A. Irvine
 */
public class A030530 implements Sequence {

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
