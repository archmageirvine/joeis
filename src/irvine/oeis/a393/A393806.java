package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A393806 allocated for Alexander Yutkin.
 * @author Sean A. Irvine
 */
public class A393806 extends Sequence1 {

  private final Bumper mBumper = BumperFactory.range(0, 8);
  private int[] mA = new int[] {};
  private int mCenter = -1;

  @Override
  public Z next() {
    if (++mCenter >= 10) {
      if (!mBumper.bump(mA)) {
        mA = new int[mA.length + 1];
        mA[0] = 1;
      }
      mCenter = Functions.MAX.i(mA) + 1;
    }
    final StringBuilder sb = new StringBuilder();
    for (final int v : mA) {
      sb.append(v);
    }
    return new Z(sb.toString() + mCenter + sb.reverse());
  }
}
