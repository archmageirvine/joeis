package irvine.oeis.a281;
// Generated by gen_seq4.pl manch5/filter at 2024-03-12 22:08

import irvine.factor.factor.Jaguar;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000593;
import irvine.oeis.a005.A005843;
import irvine.oeis.a146.A146076;

/**
 * A281707 Even integers k such that phi(sum of even divisors of k) = sum of odd divisors of k.
 * @author Georg Fischer
 */
public class A281707 extends FilterSequence {

  /** Construct the sequence. */
  public A281707() {
    super(1, new A005843().skip(), (k, v) -> Jaguar.factor(new A146076().a(v)).phi().equals(new A000593().a(v)));
  }
}
