package irvine.oeis.a183;
// Generated by gen_seq4.pl compseq at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.ComplementSequence;
import irvine.oeis.a079.A079524;

/**
 * A183868 a(n) = n + floor(2*sqrt(n+1)); complement of A079524.
 * @author Georg Fischer
 */
public class A183868 extends ComplementSequence {

  /** Construct the sequence. */
  public A183868() {
    super(new A079524());
    next();
  }
}
