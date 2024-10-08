package irvine.oeis.a136;
// Generated by gen_seq4.pl 2024-10-04.ack/sintrif at 2024-10-04 23:34

import irvine.math.z.Binomial;
import irvine.oeis.a069.A069010;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A136277 From the binary representation of n: binomial(number of ones, number of blocks of contiguous ones).
 * @author Georg Fischer
 */
public class A136277 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A136277() {
    super(0, (term, n) -> Binomial.binomial(Integer.bitCount(n), term.intValue()), "", new A069010());
  }
}
