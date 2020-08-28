package irvine.oeis.a275;
// Generated by gen_seq4.pl compseq at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.ComplementSequence;
import irvine.oeis.a030.A030457;

/**
 * A275319 Numbers n such that n concatenated with n+1 is not a prime.
 * @author Georg Fischer
 */
public class A275319 extends ComplementSequence {

  /** Construct the sequence. */
  public A275319() {
    super(new A030457());
    next();
  }
}
