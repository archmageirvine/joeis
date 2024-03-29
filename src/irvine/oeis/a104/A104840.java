package irvine.oeis.a104;
// Generated by gen_seq4.pl primerg at 2022-04-10 16:39

import irvine.oeis.a000.A000796;
import irvine.oeis.a103.A103812;

/**
 * A104840 Primes from merging of 20 successive digits in decimal expansion of Pi.
 * @author Georg Fischer
 */
public class A104840 extends A103812 {

  /** Construct the sequence. */
  public A104840() {
    super(new A000796(), 20, 0);
  }
}
