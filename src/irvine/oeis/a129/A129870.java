package irvine.oeis.a129;
// Generated by gen_seq4.pl 2024-09-21.ack/sintrif at 2024-09-21 22:07

import irvine.math.function.Functions;
import irvine.oeis.a006.A006988;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A129870 Difference between the (10^n)-th and the (10^n-1)-th prime.
 * @author Georg Fischer
 */
public class A129870 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A129870() {
    super(1, (term, n) -> term.subtract(Functions.PREV_PRIME.z(term)), "", new A006988());
  }
}
