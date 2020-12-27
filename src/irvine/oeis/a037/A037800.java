package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037800.
 * @author Sean A. Irvine
 */
public class A037800 implements Sequence {

  // After Gheorghe Coserea

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ZERO : Z.valueOf(Long.bitCount(mN & ~(mN >>> 1)) - 1);
  }
}
