package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086891 Denominator of 4*(Integral_{x=0..1} (1-x^2)^((2n-1)/2) dx)/Pi.
 * @author Sean A. Irvine
 */
public class A086891 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    return Z.ONE.shiftLeft(2 * mN - 1 - Long.bitCount(mN));
  }
}
