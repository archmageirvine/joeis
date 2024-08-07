package irvine.oeis.a338;
// Generated by gen_seq4.pl 2024-07-24.ack/sintrif at 2024-07-24 22:30

import irvine.math.function.Functions;
import irvine.oeis.a018.A018783;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A338554 Number of non-constant integer partitions of n whose parts have a common divisor &gt; 1.
 * @author Georg Fischer
 */
public class A338554 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A338554() {
    super(0, (term, n) -> term.subtract(Functions.SIGMA0.z(n)).add(1), "0", new A018783());
  }
}
