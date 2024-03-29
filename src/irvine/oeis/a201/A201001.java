package irvine.oeis.a201;
// Generated by gen_seq4.pl 2023-11-17/filter at 2023-11-17 22:41

import irvine.oeis.FilterSequence;
import irvine.oeis.a006.A006190;

/**
 * A201001 Primes in the Lucas U(3,-1) sequence.
 * @author Georg Fischer
 */
public class A201001 extends FilterSequence {

  /** Construct the sequence. */
  public A201001() {
    super(1, new A006190(), PRIME);
  }
}
