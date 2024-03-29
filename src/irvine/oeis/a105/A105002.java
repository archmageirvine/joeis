package irvine.oeis.a105;
// Generated by gen_seq4.pl primerg at 2022-04-10 16:39

import irvine.oeis.a072.A072334;
import irvine.oeis.a103.A103812;

/**
 * A105002 Primes from merging of 6 successive digits in decimal expansion of exp(2).
 * @author Georg Fischer
 */
public class A105002 extends A103812 {

  /** Construct the sequence. */
  public A105002() {
    super(new A072334(), 6, 1);
  }
}
