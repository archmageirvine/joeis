package irvine.oeis.a074;

import irvine.math.cr.CR;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074294 Integers 1 to 2*k followed by integers 1 to 2*k + 2 and so on.
 * @author Sean A. Irvine
 */
public class A074294 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).subtract(Binomial.binomial(CR.valueOf(mN).sqrt().add(CR.HALF).floor(), Z.TWO).multiply2());
  }
}
