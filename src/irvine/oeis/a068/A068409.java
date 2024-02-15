package irvine.oeis.a068;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068409 a(n) = binomial(binomial(2*n,n),n).
 * @author Sean A. Irvine
 */
public class A068409 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(Binomial.binomial(2 * ++mN, mN), Z.valueOf(mN));
  }
}

