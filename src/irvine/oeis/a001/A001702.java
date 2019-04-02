package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001702 Generalized Stirling numbers.
 * @author Sean A. Irvine
 */
public class A001702 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z n2 = Z.valueOf(mN).square();
    return n2.add(7 * mN + 14).multiply(mN).multiply(mN - 1).multiply(mN + 1).multiply(mN + 4).divide(48);
  }
}
