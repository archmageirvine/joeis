package irvine.oeis.a067;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006906;
import irvine.util.string.StringUtils;

/**
 * A067520.
 * @author Sean A. Irvine
 */
public class A067569 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Sequence mB = new A006906();
  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (mB.next().mod(IntegerPartition.partitions(++mN)).isZero()) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 1000 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
    }
  }
}

