package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a003.A003239;

/**
 * A005648.
 * @author Sean A. Irvine
 */
public class A005648 extends A003239 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final long k = mN / 2;
    return super.next().add(Binomial.binomial(2 * k, k)).divide2();
  }
}

