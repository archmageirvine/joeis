package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017724.
 * @author Sean A. Irvine
 */
public class A017724 implements Sequence {

  private long mN = 59;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 60);
  }
}

