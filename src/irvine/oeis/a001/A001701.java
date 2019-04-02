package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001701 Generalized Stirling numbers.
 * @author Sean A. Irvine
 */
public class A001701 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z n2 = Z.valueOf(mN).square();
    return n2.multiply(3).add(17 * mN + 26).multiply(mN).multiply(mN - 1).divide(24);
  }
}
