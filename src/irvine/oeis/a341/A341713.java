package irvine.oeis.a341;
// Generated by gen_seq4.pl filtpos at 2023-09-08 10:19

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a004.A004094;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A341713 Indices of Ennesrem primes: k such that A004094(k)-1 is prime.
 * @author Georg Fischer
 */
public class A341713 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A341713() {
    super(1, 0, new SimpleTransformSequence(new A004094(), t -> t.add(-1)), PRIME);
  }
}
