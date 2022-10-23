package irvine.oeis.a053;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053733 a(n) = ceiling(binomial(n,9)/n).
 * @author Sean A. Irvine
 */
public class A053733 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 9).add(mN - 1).divide(mN);
  }
}
