package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000854 Number of n-input 3-output switching networks under action of complementing group <code>C(2,n)</code> on inputs and S(3) and <code>C(2,3)</code> on outputs.
 * @author Sean A. Irvine
 */
public class A000854 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(3 * (1 << mN))
      .add(Z.ONE.shiftLeft(3 * (1 << (mN - 1))).multiply((1 << mN) - 1).multiply(20))
      .add(Z.ONE.shiftLeft((1 << mN) + 3))
      .add(Z.ONE.shiftLeft((1 << (mN - 1)) + 4).multiply((1 << mN) - 1))
      .add(Z.ONE.shiftLeft(1 << (mN + 1)).multiply(6))
      .shiftRight(mN)
      .divide(48);
  }
}

