package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001618.
 * @author Sean A. Irvine
 */
public class A001618 implements Sequence {

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
