package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Binomial;

/**
 * A002663 <code>a(n) = 2^n - C(n,0) - C(n,1) - C(n,2) - C(n,3)</code>.
 * @author Sean A. Irvine
 */
public class A002663 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).subtract(mN + 1).subtract(Binomial.binomial(mN, 2)).subtract(Binomial.binomial(mN, 3));
  }
}
