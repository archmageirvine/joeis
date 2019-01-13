package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000853.
 * @author Sean A. Irvine
 */
public class A000853 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(1 << (mN + 1))
      .add(Z.ONE.shiftLeft(1 << mN).multiply((1 << mN) - 1).multiply(6))
      .add(Z.ONE.shiftLeft((1 << mN) + 1))
      .shiftRight(mN + 3);
  }
}

