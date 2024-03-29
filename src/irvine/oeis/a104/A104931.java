package irvine.oeis.a104;
// Generated by gen_seq4.pl primerg at 2022-04-10 16:39

import irvine.oeis.a002.A002388;
import irvine.oeis.a103.A103812;

/**
 * A104931 Primes from merging of 8 successive digits in decimal expansion of (Pi^2).
 * @author Georg Fischer
 */
public class A104931 extends A103812 {

  /** Construct the sequence. */
  public A104931() {
    super(new A002388(), 8, 1);
  }
}
