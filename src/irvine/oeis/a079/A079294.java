package irvine.oeis.a079;
// Generated by gen_seq4.pl 2024-07-20/sintrif at 2024-07-20 00:09

import irvine.math.function.Functions;
import irvine.oeis.a000.A000367;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A079294 Number of distinct prime factors of the numerator of the 2n-th Bernoulli number.
 * @author Georg Fischer
 */
public class A079294 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A079294() {
    super(0, (term, n) -> Functions.OMEGA.z(term.abs()), "", new A000367());
  }
}
