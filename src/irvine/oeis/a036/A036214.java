package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036214 Bit-reversing masks for 2*n bits.
 * @author Sean A. Irvine
 */
public class A036214 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(2L * mN * mN + 3L * mN + 1).add(Z.ONE.shiftLeft(2L * mN * mN + 2L * mN)).subtract(Z.ONE.shiftLeft(3L * mN + 1)).subtract(1).shiftLeft(mN).divide(Z.ONE.shiftLeft(2L * mN + 1).subtract(1));
  }
}
