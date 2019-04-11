package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008464 <code>a(n) = 2^(2n+3) - 2^n*(n+3)</code>.
 * @author Sean A. Irvine
 */
public class A008464 implements Sequence {

  private int mN = -2;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(2 * mN + 3).subtract(Z.valueOf(mN + 3).shiftLeft(mN));
  }
}
