package irvine.oeis.a108;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A108398 a(n) = n*(1 + n^n)/2.
 * @author Georg Fischer
 */
public class A108398 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ZERO : Z.valueOf(mN).pow(mN).add(1).multiply(mN).divide2();
  }
}
