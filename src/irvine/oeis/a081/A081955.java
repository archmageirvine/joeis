package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081955 a(n) = 2^r*3^s where r = n(n+1)/2 and s = n(n-1)/2.
 * @author Georg Fischer
 */
public class A081955 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN * (mN + 1) / 2).multiply(Z.THREE.pow(mN * (mN - 1) / 2));
  }
}
