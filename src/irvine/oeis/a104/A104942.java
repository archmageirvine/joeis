package irvine.oeis.a104;
// Generated by gen_seq4.pl primerg at 2022-04-10 16:39

import irvine.oeis.a001.A001620;
import irvine.oeis.a103.A103812;

/**
 * A104942 Primes from merging of 8 successive digits in decimal expansion of the Euler-Mascheroni Constant.
 * @author Georg Fischer
 */
public class A104942 extends A103812 {

  /** Construct the sequence. */
  public A104942() {
    super(new A001620(), 8, 1);
  }
}
