package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004524.
 * @author Sean A. Irvine
 */
public class A004524 implements Sequence {

  private Z mN = Z.NEG_ONE;
  private int mCount = 0;

  @Override
  public Z next() {
    if (mCount == 0) {
      mN = mN.add(1);
      mCount = mN.isEven() ? 3 : 1;
    }
    --mCount;
    return mN;
  }
}
