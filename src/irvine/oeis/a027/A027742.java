package irvine.oeis.a027;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027742 a(n) = phi(4^n-1)/(2*n).
 * @author Sean A. Irvine
 */
public class A027742 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Euler.phi(Z.ONE.shiftLeft(2 * mN).subtract(1)).divide(2L * mN);
  }
}
