package irvine.oeis.a017;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017756.
 * @author Sean A. Irvine
 */
public class A017756 implements Sequence {

  private long mN = 91;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 92);
  }
}

