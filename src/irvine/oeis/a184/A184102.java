package irvine.oeis.a184;
// Generated by gen_seq4.pl compseq at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.ComplementSequence;

/**
 * A184102 n+floor(4*sqrt(n)); complement of A184103.
 * @author Georg Fischer
 */
public class A184102 extends ComplementSequence {

  /** Construct the sequence. */
  public A184102() {
    super(new A184103());
    next();
  }
}
