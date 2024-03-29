package irvine.oeis.a104;
// Generated by gen_seq4.pl primerg at 2022-04-10 16:39

import irvine.oeis.a006.A006752;
import irvine.oeis.a103.A103812;

/**
 * A104917 Primes from merging of 3 successive digits in decimal expansion of Catalan's constant.
 * @author Georg Fischer
 */
public class A104917 extends A103812 {

  /** Construct the sequence. */
  public A104917() {
    super(new A006752(), 3, 1);
  }
}
