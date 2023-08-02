package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002451 Expansion of 1/((1-x)*(1-4*x)*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A002451 extends Sequence0 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Z.FIVE.subtract(Z.EIGHT.multiply(Z.ONE.shiftLeft(2L * mN))).add(Z.THREE.multiply(Z.NINE.pow(mN))).divide(120);
  }
}
