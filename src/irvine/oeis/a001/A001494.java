package irvine.oeis.a001;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001494 Numbers n such that phi(n) = phi(n+2).
 * @author Sean A. Irvine
 */
public class A001494 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (LongUtils.phi(mN) == LongUtils.phi(mN + 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
