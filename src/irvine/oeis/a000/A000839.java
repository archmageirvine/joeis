package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000839 Number of n-input 3-output switching networks under action of complementing group on the inputs and outputs.
 * @author Sean A. Irvine
 */
public class A000839 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(3 * (1 << mN) - 3 - mN)
      .add(Z.ONE.shiftLeft(3 << (mN - 1)))
      .subtract(Z.ONE.shiftLeft((3 << (mN - 1)) - mN));
  }
}

