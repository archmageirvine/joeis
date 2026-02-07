package irvine.oeis.a083;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A083659.
 * @author Sean A. Irvine
 */
public class A083678 extends Sequence1 {

  private final Bumper mBumper = BumperFactory.range(1, 9);
  private int[] mA = {};

  @Override
  public Z next() {
    if (!mBumper.bump(mA)) {
      mA = new int[mA.length + 1];
      Arrays.fill(mA, 1);
    }
    Z res = Z.ZERO;
    for (final int v : mA) {
      res = res.multiply(10).add(v);
    }
    for (int k = mA.length - 1; k >= 0; --k) {
      res = res.multiply(10).add(10 - mA[k]);
    }
    return res;
  }
}
