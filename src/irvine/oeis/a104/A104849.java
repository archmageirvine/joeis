package irvine.oeis.a104;
// Generated by gen_seq4.pl primerg at 2022-04-10 16:39

import irvine.oeis.a001.A001113;
import irvine.oeis.a103.A103812;

/**
 * A104849 Primes from merging of 8 successive digits in decimal expansion of e.
 * @author Georg Fischer
 */
public class A104849 extends A103812 {

  /** Construct the sequence. */
  public A104849() {
    super(new A001113(), 8, 1);
  }
}
