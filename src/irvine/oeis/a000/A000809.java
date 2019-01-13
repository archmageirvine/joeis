package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000809.
 * @author Sean A. Irvine
 */
public class A000809 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 29) { // play it safe
      throw new UnsupportedOperationException();
    }
    return Z.ONE.shiftLeft(3 * (1 << mN)).add(Z.ONE.shiftLeft(3 * (1 << (mN - 1))).multiply((1 << mN) - 1)).shiftRight(mN);
  }
}

