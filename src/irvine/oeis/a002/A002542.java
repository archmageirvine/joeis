package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002542.
 * @author Sean A. Irvine
 */
public class A002542 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 32) {
      throw new UnsupportedOperationException();
    }
    return Z.ONE.shiftLeft((1 << mN) - 2).subtract(Z.ONE.shiftLeft((1 << (mN - 1)) - 1));
  }
}
