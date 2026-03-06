package irvine.oeis.a393;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A393807 allocated for Alexander Yutkin.
 * @author Sean A. Irvine
 */
public class A393807 extends Sequence1 {

  private final Bumper mBumper = BumperFactory.range(1, 9);
  private int[] mA = new int[] {};
  private int mCenter = -1;

  @Override
  public Z next() {
    if (mA.length == 0) {
      if (++mCenter < 10) {
        return Z.valueOf(mCenter);
      }
      mA = new int[] {1};
      mCenter = -1;
    }
    if (++mCenter >= Functions.MIN.i(mA)) {
      if (!mBumper.bump(mA)) {
        mA = new int[mA.length + 1];
        Arrays.fill(mA, 1);
      }
      mCenter = 0;
    }
    final StringBuilder sb = new StringBuilder();
    for (final int v : mA) {
      sb.append(v);
    }
    return new Z(sb.toString() + mCenter + sb.reverse());
  }
}
