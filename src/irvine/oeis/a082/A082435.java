package irvine.oeis.a082;
// Generated by gen_seq4.pl 2024-04-22/filter at 2024-04-22 22:28

import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002385;

/**
 * A082435 Palindromic primes with middle digit 0.
 * @author Georg Fischer
 */
public class A082435 extends FilterSequence {

  /** Construct the sequence. */
  public A082435() {
    super(1, new A002385(), v -> {
      final String s = v.toString();
      final char md = s.charAt(s.length() / 2);
      return md == '0';
    });
  }
}
