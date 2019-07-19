package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a009.A009421;

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
        if (A009421.isCube(Z.valueOf(mN - k * k * k))) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
