package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003993 Sequence b_3 (n) arising from homology of partitions with even number of blocks.
 * @author Sean A. Irvine
 */
public class A003993 implements Sequence {

  private Z mA = Z.TWO;
  private long mN = 2;

  @Override
  public Z next() {
    mN += 2;
    mA = mA.multiply(3);
    return mA.subtract(mN);
  }
}
