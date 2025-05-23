package irvine.oeis.a207;
// Generated by gen_seq4.pl 2024-12-04.ack/filtpos at 2024-12-04 22:12

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a066.A066680;

/**
 * A207432 Positions of primes in A066680, the badly sieved numbers.
 * @author Georg Fischer
 */
public class A207432 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A207432() {
    super(1, 1, new A066680(), PRIME);
  }
}
