package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004525 One even followed by three odd.
 * @author Sean A. Irvine
 */
public class A004525 implements Sequence {

  private Z mN = Z.NEG_ONE;
  private int mCount = 0;

  @Override
  public Z next() {
    if (mCount == 0) {
      mN = mN.add(1);
      mCount = mN.isEven() ? 1 : 3;
    }
    --mCount;
    return mN;
  }
}
