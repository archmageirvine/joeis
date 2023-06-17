package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000005 d(n) (also called tau(n) or sigma_0(n)), the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A000005 extends AbstractSequence {

  /* Construct the sequence. */
  public A000005() {
    super(1);
  }

  protected long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sigma0();
  }
}

