package irvine.oeis.a066;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066768 Sum_{d|n} binomial(2*d-2,d-1).
 * @author Sean A. Irvine
 */
public class A066768 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Binomial.binomial(2L * d - 2, d - 1));
  }
}

