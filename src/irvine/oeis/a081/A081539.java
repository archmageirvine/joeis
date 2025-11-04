package irvine.oeis.a081;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A081539 Triangle read by rows in which the n-th row contains the n numbers in increasing order formed by the concatenation of first n-1 numbers. (The digits of the numbers with 2 or more digits are taken as one entity.) First row is taken to be 0.
 * @author Sean A. Irvine
 */
public class A081539 extends Sequence1 {

  private Bumper mBumper = BumperFactory.increasing(0);
  private int[] mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = new int[0];
      return Z.ZERO;
    }
    if (!mBumper.bump(mA)) {
      mA = IntegerUtils.identity1(new int[mA.length + 1]);
      mBumper = BumperFactory.increasing(mA.length + 2);
    }
    final StringBuilder sb = new StringBuilder();
    for (final int u : mA) {
      sb.append(u);
    }
    return new Z(sb);
  }
}
