package irvine.oeis.a069;

import java.util.HashMap;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A069716 Smallest number such that the LCM of the digits equals n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A069716 extends Sequence1 {

  private final HashMap<Long, Long> mFirsts = new HashMap<>();
  private long mN = 0;
  private long mM = 10;

  @Override
  public Z next() {
    if (++mN < 10) {
      return Z.valueOf(mN);
    }
    if (mN > 2520) {
      return Z.ZERO;
    }
    if ((mN & 15) == 0 || mN % 27 == 0 || mN % 25 == 0 || mN % 49 == 0) {
      return Z.ZERO;
    }
    final long gpf = Functions.GPF.l(mN);
    if (gpf > 10) {
      return Z.ZERO;
    }
    while (mFirsts.get(mN) == null) {
      final int[] d = ZUtils.digitCounts(++mM);
      if (d[0] == 0) {
        long lcm = 0;
        for (int k = 2; k < d.length; ++k) {
          if (d[k] > 0) {
            lcm = lcm == 0 ? k : LongUtils.lcm(lcm, k);
          }
        }
        if (!mFirsts.containsKey(lcm)) {
          mFirsts.put(lcm, mM);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

