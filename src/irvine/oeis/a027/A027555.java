package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027555 Triangle of binomial coefficients C(-n,k).
 * @author Sean A. Irvine
 */
public class A027555 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(-mN, mM);
  }
}
