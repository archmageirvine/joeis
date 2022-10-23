package irvine.oeis.a107;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A107665 Numbers with semiprime digits (digits 4, 6, 9 only).
 * Copied from A007932.
 * @author Georg Fischer
 */
public class A107665 extends Sequence1 {

  private long mN = 2;
  private long mLimit = 6;

  @Override
  public Z next() {
    if (++mN == mLimit) {
      mLimit *= 3;
      mN = mLimit / 2;
    }
    return new Z(Long.toString(mN, 3).substring(1).replace('2', '9').replace('1', '6').replace('0', '4'));
  }
}
