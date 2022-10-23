package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001618 Nearest integer to 2*n*log(n).
 * @author Sean A. Irvine
 */
public class A001618 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN >= (1L << 52)) {
      // I expect wrong answers to appear once exhaust precision of mantissa
      throw new UnsupportedOperationException();
    }
    return Z.valueOf((long) (0.5 + Math.log(mN) * (mN * 2)));
  }
}
