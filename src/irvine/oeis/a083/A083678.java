package irvine.oeis.a083;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A083678 Numbers m = d_1 d_2 ... d_k (in base 10) with properties that k is even and d_i + d_{k+1-i} = 10 for all i.
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
