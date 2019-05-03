package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000838 Number of <code>n-input 2-output</code> switching networks under action of complementing group on the inputs and outputs.
 * @author Sean A. Irvine
 */
public class A000838 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft((1 << (mN + 1)) - 2 - mN)
      .add(Z.ONE.shiftLeft(1 << mN))
      .subtract(Z.ONE.shiftLeft((1 << mN) - mN));
  }
}

