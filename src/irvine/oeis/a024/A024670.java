package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A024670 Numbers that are sums of 2 distinct positive cubes.
 * @author Sean A. Irvine
 */
public class A024670 implements Sequence {

  private long mN = 8;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long k = 1; k * k * k * 2 < mN; ++k) {
        if (ZUtils.isCube(Z.valueOf(mN - k * k * k))) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
