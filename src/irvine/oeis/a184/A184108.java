package irvine.oeis.a184;
// Generated by gen_seq4.pl compseq at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.ComplementSequence;

/**
 * A184108 n + floor(3*sqrt(n-1)); complement of A184109.
 * @author Georg Fischer
 */
public class A184108 extends ComplementSequence {

  /** Construct the sequence. */
  public A184108() {
    super(new A184109());
    next();
  }
}
