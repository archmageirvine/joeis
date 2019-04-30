package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000853 Number of n-input 2-output switching networks under action of complementing group <code>C(2,n)</code> on inputs and <code>S(2)</code> and <code>C(2,2)</code> on outputs.
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

