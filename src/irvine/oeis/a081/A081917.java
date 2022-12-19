package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081917 a(0)=1, a(n)= n^(n-2)(7n^2-3n+2)/6 (n&gt;0).
 * @author Georg Fischer
 */
public class A081917 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : Z.valueOf(mN).pow(mN - 2).multiply(7 * mN * mN - 3 * mN + 2).divide(6);
  }
}
