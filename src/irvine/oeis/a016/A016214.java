package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016214 Expansion of 1/((1-x)(1-3x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A016214 extends Sequence0 {

  private Z mT = Z.valueOf(21);
  private int mN = 1;

  @Override
  public Z next() {
    mT = mT.multiply(3);
    return Z.ONE.shiftLeft(3L * ++mN + 1).subtract(mT).add(5).divide(70);
  }
}
