package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016203 Expansion of 1/((1-x)(1-2x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A016203 implements Sequence {

  private Z mA = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.shiftLeft(3).add(Z.ONE.shiftLeft(mN)).subtract(1);
    }
    return mA;
  }
}
