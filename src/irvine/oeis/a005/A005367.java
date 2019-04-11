package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005367 <code>a(n) = 2*(2^n + 1)*(2^(n+1) - 1)</code>.
 * @author Sean A. Irvine
 */
public class A005367 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).add(1).multiply(Z.ONE.shiftLeft(mN + 1).subtract(1)).multiply2();
  }
}
