package irvine.oeis.a156;
// Generated by gen_seq4.pl 2024-08-01.ack/mulclose at 2024-08-01 22:21

import irvine.oeis.a053.A053176;
import irvine.oeis.closure.MultiplicativeClosureSequence;

/**
 * A156543 Multiplicative closure of primes that are not Sophie Germain primes (A053176).
 * @author Georg Fischer
 */
public class A156543 extends MultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A156543() {
    super(1, new A053176());
  }
}
