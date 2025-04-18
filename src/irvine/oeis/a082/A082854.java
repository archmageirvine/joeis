package irvine.oeis.a082;
// Generated by gen_seq4.pl 2024-11-10.ack/sintrif at 2024-11-10 23:25

import irvine.math.z.Z;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A082854 Integers 1 to Catalan(n) followed by integers 1 to Catalan(n+1) etc.
 * @author Georg Fischer
 */
public class A082854 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A082854() {
    super(0, (term, n) -> term.add(Z.ONE), "", new A082853());
  }
}
