package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030297 a(n) = n*(n + a(n-1)) with a(0)=0.
 * @author Sean A. Irvine
 */
public class A030297 implements Sequence {

  private Z mA = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.add(mN).multiply(mN);
    }
    return mA;
  }
}

