package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002451.
 * @author Sean A. Irvine
 */
public class A002451 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Z.FIVE.subtract(Z.EIGHT.multiply(Z.ONE.shiftLeft(2 * mN))).add(Z.THREE.multiply(Z.NINE.pow(mN))).divide(120);
  }
}
