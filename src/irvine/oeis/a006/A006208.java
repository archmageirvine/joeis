package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MobiusTransformSequence;

/**
 * A006208 Generalized Fibonacci numbers A_{n,3}.
 * @author Sean A. Irvine
 */
public class A006208 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A006208() {
    super(new A006207.PhinSequence(3), 0);
    super.next();
  }

  private int mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
