package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A037800 Number of occurrences of 01 in the binary expansion of n.
 * @author Sean A. Irvine
 */
public class A037800 extends Sequence0 {

  // After Gheorghe Coserea

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ZERO : Z.valueOf(Long.bitCount(mN & ~(mN >>> 1)) - 1);
  }
}
