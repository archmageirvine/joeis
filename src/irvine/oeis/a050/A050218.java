package irvine.oeis.a050;
// Generated by gen_seq4.pl 2024-06-23/sintrif at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.a006.A006753;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A050218 Sums of digits of Smith numbers A006753.
 * @author Georg Fischer
 */
public class A050218 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A050218() {
    super(1, (term, n) -> Functions.DIGIT_SUM.z(10, term), "", new A006753());
  }
}
