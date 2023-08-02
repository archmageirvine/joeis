package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000838 Number of n-input 2-output switching networks under action of complementing group on the inputs and outputs.
 * @author Sean A. Irvine
 */
public class A000838 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft((1L << (mN + 1)) - 2 - mN)
      .add(Z.ONE.shiftLeft(1L << mN))
      .subtract(Z.ONE.shiftLeft((1L << mN) - mN));
  }
}

