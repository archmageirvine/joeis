package irvine.oeis.a061;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A061374 Numbers which have more different digits than their cubes.
 * @author Sean A. Irvine
 */
public class A061374 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (Long.bitCount(LongUtils.syndrome(mN)) > Long.bitCount(ZUtils.syn(n.pow(3)))) {
        return n;
      }
    }
  }
}

