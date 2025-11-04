package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A081541 Triangle read by rows: the n-th row contains n numbers sorted in decreasing value, each build by dropping a different number from the sequence [n,n-1,n-2,....,1] and concatenating the n-1 others. By definition the first row contains 0.
 * @author Sean A. Irvine
 */
public class A081541 extends Sequence1 {

  private Bumper mBumper = BumperFactory.decreasing(0);
  private int[] mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = new int[0];
      return Z.ZERO;
    }
    if (!mBumper.bump(mA)) {
      mA = new int[mA.length + 1];
      for (int k = 1; k <= mA.length; ++k) {
        mA[mA.length - k] = k + 1;
      }
      mBumper = BumperFactory.decreasing(1);
    }
    final StringBuilder sb = new StringBuilder();
    for (final int u : mA) {
      sb.append(u);
    }
    return new Z(sb);
  }
}
