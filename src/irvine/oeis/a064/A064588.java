package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064588 a(n) = (2^n)^12*((2^n)^2-1)*((2^n)^6-1)*((2^n)^8 + (2^n)^4+1).
 * @author Georg Fischer
 */
public class A064588 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z n2 = Z.ONE.shiftLeft(mN);
    return n2.pow(12).multiply(n2.square().subtract(1)).multiply(n2.pow(6).subtract(1)).multiply(n2.pow(8).add(n2.pow(4)).add(1));
  }
}
