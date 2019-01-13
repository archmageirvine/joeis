package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002416.
 * @author Sean A. Irvine
 */
public class A002416 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 46340) {
      throw new UnsupportedOperationException();
    }
    return Z.ONE.shiftLeft(mN * mN);
  }
}
