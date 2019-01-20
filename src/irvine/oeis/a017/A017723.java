package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017723.
 * @author Sean A. Irvine
 */
public class A017723 implements Sequence {

  private long mN = 58;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 59);
  }
}

