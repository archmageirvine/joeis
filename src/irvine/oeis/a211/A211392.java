package irvine.oeis.a211;
// Generated by gen_seq4.pl 2024-07-20/sintrif at 2024-07-20 00:09

import irvine.math.function.Functions;
import irvine.oeis.a009.A009490;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A211392 The number of divisors d of n! such that the symmetric group on n letters contains no elements of order d.
 * @author Georg Fischer
 */
public class A211392 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A211392() {
    super(1, (term, n) -> Functions.SIGMA0.z(Functions.FACTORIAL.z(n)).subtract(term), "", new A009490());
  }
}
