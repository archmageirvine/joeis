package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005317 a(n) = (2^n + C(2*n,n))/2.
 * @author Sean A. Irvine
 */
public class A005317 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2L * mN, mN).add(Z.ONE.shiftLeft(mN)).divide2();
  }
}
