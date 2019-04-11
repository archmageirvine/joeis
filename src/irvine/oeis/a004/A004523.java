package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004523 Two even followed by one odd; or <code>floor(2n/3)</code>.
 * @author Sean A. Irvine
 */
public class A004523 implements Sequence {

  private Z mN = Z.NEG_ONE;
  private int mCount = 0;

  @Override
  public Z next() {
    if (mCount == 0) {
      mN = mN.add(1);
      mCount = mN.isEven() ? 2 : 1;
    }
    --mCount;
    return mN;
  }
}
