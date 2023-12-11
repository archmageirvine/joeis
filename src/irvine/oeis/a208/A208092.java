package irvine.oeis.a208;

import irvine.math.z.Z;
import irvine.oeis.a006.A006207;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A208092 Generalized Fibonacci numbers A_{n,6}.
 * @author Sean A. Irvine
 */
public class A208092 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A208092() {
    super(new A006207.PhinSequence(6), 0);
    super.next();
  }

  private int mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
