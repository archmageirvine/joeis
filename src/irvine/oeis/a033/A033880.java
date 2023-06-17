package irvine.oeis.a033;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A033880 Abundance of n, or (sum of divisors of n) - 2n.
 * @author Sean A. Irvine
 */
public class A033880 extends AbstractSequence {

  /* Construct the sequence. */
  public A033880() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sigma().subtract(2 * mN);
  }
}
