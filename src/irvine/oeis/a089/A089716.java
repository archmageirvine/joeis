package irvine.oeis.a089;
// Generated by gen_seq4.pl 2024-03-19/filter at 2024-03-19 22:04

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A089716 Primes that are both congruent to 1 mod 10 and congruent to 1 or 2 mod 9.
 * @author Georg Fischer
 */
public class A089716 extends FilterSequence {

  /** Construct the sequence. */
  public A089716() {
    super(1, new A000040(), p -> p.mod(10) == 1 && p.mod(9) <= 2);
  }
}
