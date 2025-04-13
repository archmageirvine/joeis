package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076585.
 * @author Sean A. Irvine
 */
public class A076670 extends Sequence1 {

  // Every term is congruent to 1, 2049, 3073, or 9217 modulo 10240
  private static final long[] STEPS = {2048, 1024, 6144, 1024};
  private static final Z POWER = Z.valueOf(9000000000L);
  private long mN = -1023;
  private int mS = 2;

  @Override
  public Z next() {
    while (true) {
      if (++mS == STEPS.length) {
        mS = 0;
      }
      mN += STEPS[mS];
      final Z n = Z.valueOf(mN);
      if (Z.TEN.modPow(POWER, n).equals(mN - 1) && n.isProbablePrime()) {
        return n;
      }
    }
  }
}
