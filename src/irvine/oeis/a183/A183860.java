package irvine.oeis.a183;
// Generated by gen_seq4.pl compseq at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.ComplementSequence;

/**
 * A183860 n+floor(sqrt(3n+1)); complement of A183861.
 * @author Georg Fischer
 */
public class A183860 extends ComplementSequence {

  /** Construct the sequence. */
  public A183860() {
    super(new A183861());
    next();
  }
}
