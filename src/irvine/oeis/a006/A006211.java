package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Phi2TransformSequence;

/**
 * A006211 Generalized Fibonacci numbers D_{n,3}.
 * @author Sean A. Irvine
 */
public class A006211 extends Phi2TransformSequence {

  /** Construct the sequence. */
  public A006211() {
    super(new A006210.PsinSequence(3), 0);
    super.next();
  }

  private int mN = 0;

  @Override
  public Z next() {
    return super.next().divide(2L * ++mN);
  }
}
