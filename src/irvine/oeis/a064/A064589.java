package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064589 a(n) = (3^n)^12*((3^n)^2-1)*((3^n)^6-1)*((3^n)^8 + (3^n)^4+1).
 * @author Georg Fischer
 */
public class A064589 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z n3 = Z.THREE.pow(mN);
    return n3.pow(12).multiply(n3.square().subtract(1)).multiply(n3.pow(6).subtract(1)).multiply(n3.pow(8).add(n3.pow(4)).add(1));
  }
}
