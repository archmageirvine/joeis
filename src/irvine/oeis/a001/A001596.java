package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001596 a(n) = 7^n + n^7.
 * @author Sean A. Irvine
 */
public class A001596 implements Sequence {

  private long mN = -1;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mT = mT.multiply(7);
    }
    return mT.add(Z.valueOf(mN).pow(7));
  }
}
