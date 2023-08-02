package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081918 a(0) = 1; a(n) = n^(n-1)(3n-1)/2 (n&gt;0).
 * @author Georg Fischer
 */
public class A081918 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : Z.valueOf(mN).pow(mN - 1).multiply(3L * mN - 1).divide2();
  }
}
