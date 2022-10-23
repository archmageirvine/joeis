package irvine.oeis.a056;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056174 Number of non-monotone maps from 1,...,n to 1,...,n.
 * @author Sean A. Irvine
 */
public class A056174 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN).subtract(Binomial.binomial(2 * mN, mN)).add(mN);
  }
}
