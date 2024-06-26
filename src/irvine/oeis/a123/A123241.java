package irvine.oeis.a123;
// Generated by gen_seq4.pl 2024-06-23/sintrif at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.a001.A001359;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A123241 Number of squares &lt; lesser of twin primes.
 * @author Georg Fischer
 */
public class A123241 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A123241() {
    super(1, (term, n) -> Functions.CEIL_SQRT.z(term), "", new A001359());
  }
}
