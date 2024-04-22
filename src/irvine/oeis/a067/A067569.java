package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006906;
import irvine.util.string.StringUtils;

/**
 * A067569 Numbers n such that A000041(n) divides A006906(n).
 * @author Sean A. Irvine
 */
public class A067569 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Sequence mB = new A006906();
  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      final int index = ++mN;
      if (mB.next().mod(Functions.PARTITIONS.z(index)).isZero()) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 1000 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
    }
  }
}

