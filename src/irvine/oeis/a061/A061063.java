package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061063 a(n) = 2^(2^n)*3^(2^n) - 2^(2^n) - 3^(2^n).
 * @author Georg Fischer
 */
public class A061063 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z p2 = Z.ONE.shiftLeft(++mN);
    final Z p22 = Z.TWO.pow(p2);
    return p22.subtract(1).multiply(Z.THREE.pow(p2)).subtract(p22);
  }
}
