package irvine.oeis.a033;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A033879 Deficiency of n, or 2n - (sum of divisors of n).
 * @author Sean A. Irvine
 */
public class A033879 extends AbstractSequence {

  /** Construct the sequence. */
  public A033879() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(2 * ++mN).subtract(Jaguar.factor(mN).sigma());
  }
}
