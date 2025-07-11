package irvine.oeis.a337;
// Generated by gen_seq4.pl 2025-06-16.ack/sintrif at 2025-06-16 21:55

import irvine.math.z.Z;
import irvine.oeis.a006.A006782;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A337550 Number of closed-loop self-avoiding paths of length 4n on a 2D square lattice where no step can be in the same direction as the previous step.
 * @author Georg Fischer
 */
public class A337550 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A337550() {
    super(1, (term, n) -> Z.EIGHT.multiply(n).multiply(term), "", new A006782());
  }
}
