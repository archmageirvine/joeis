package irvine.oeis.a066;

import irvine.math.z.Binomial;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066400/
 * @author Sean A. Irvine
 */
public class A066449 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, Euler.phiAsLong(mN));
  }
}
