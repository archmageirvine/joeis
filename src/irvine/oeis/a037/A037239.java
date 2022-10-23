package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037239 Numerator of Pi^(2n)/(GAMMA(2n)*(1-2^(-2n))*Zeta(2n)); = 8*(highest power of 2 dividing n).
 * @author Sean A. Irvine
 */
public class A037239 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.ONE.shiftLeft(3 + (int) mN.makeOdd().auxiliary());
  }
}
