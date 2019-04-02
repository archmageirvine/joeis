package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MobiusTransformSequence;

/**
 * A006209 Generalized Fibonacci numbers A_{n,4}.
 * @author Sean A. Irvine
 */
public class A006209 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A006209() {
    super(new A006207.PhinSequence(4), 0);
    super.next();
  }

  private int mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
