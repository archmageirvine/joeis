package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000203 a(n) = sigma(n), the sum of the divisors of n. Also called sigma_1(n).
 * @author Sean A. Irvine
 */
public class A000203 extends AbstractSequence {

  /** Construct the sequence. */
  public A000203() {
    super(1);
  }

  protected long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sigma();
  }
}
