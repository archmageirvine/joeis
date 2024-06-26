package irvine.oeis.a076;
// Generated by gen_seq4.pl 2024-04-22/filter at 2024-04-22 22:28

import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002385;

/**
 * A076611 Palindromic primes with prime middle digit.
 * @author Georg Fischer
 */
public class A076611 extends FilterSequence {

  /** Construct the sequence. */
  public A076611() {
    super(1, new A002385(), v -> {
      final String s = v.toString();
      final char md = s.charAt(s.length() / 2);
      return md == '2' || md == '3' || md == '5' || md == '7';
    });
  }
}
