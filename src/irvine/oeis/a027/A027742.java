package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027742 a(n) = phi(4^n-1)/(2*n).
 * @author Sean A. Irvine
 */
public class A027742 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Jaguar.factor(Z.ONE.shiftLeft(2 * mN).subtract(1)).phi().divide(2 * mN);
  }
}
