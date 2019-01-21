package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017740.
 * @author Sean A. Irvine
 */
public class A017740 implements Sequence {

  private long mN = 75;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 76);
  }
}

