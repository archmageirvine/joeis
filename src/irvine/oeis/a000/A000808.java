package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000808 Number of switching networks (see Harrison reference for precise definition).
 * @author Sean A. Irvine
 */
public class A000808 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 30) { // play it safe
      throw new UnsupportedOperationException();
    }
    return Z.ONE.shiftLeft(1 << (mN + 1)).add(Z.ONE.shiftLeft(1 << mN).multiply((1 << mN) - 1)).shiftRight(mN);
  }
}

