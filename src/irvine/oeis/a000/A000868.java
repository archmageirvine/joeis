package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000868 Number of switching networks with <code>C(2,n)</code> acting on domain and <code>GL(2</code>,Z2) acting on range.
 * @author Sean A. Irvine
 */
public class A000868 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(1 << (mN + 1))
      .add(Z.ONE.shiftLeft(mN + (1 << mN) + 2))
      .subtract(Z.ONE.shiftLeft(1 << mN))
      .add(Z.ONE.shiftLeft(mN + 1))
      .shiftRight(mN + 1)
      .divide(3);
  }
}
