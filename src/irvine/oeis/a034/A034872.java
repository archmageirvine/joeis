package irvine.oeis.a034;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034872 Central column of Losanitsch's triangle A034851.
 * @author Sean A. Irvine
 */
public class A034872 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, mN / 2).add(Binomial.binomial(mN / 2, mN / 4).multiply(Binomial.binomial(mN & 1, (mN / 2) & 1))).divide2();
  }
}
