package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017760.
 * @author Sean A. Irvine
 */
public class A017760 implements Sequence {

  private long mN = 95;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 96);
  }
}

