package irvine.oeis.a188;
// Generated by gen_seq4.pl compseq at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.ComplementSequence;
import irvine.oeis.a007.A007602;

/**
 * A188643 Numbers which are not a multiple of the product of their digits.
 * @author Georg Fischer
 */
public class A188643 extends ComplementSequence {

  /** Construct the sequence. */
  public A188643() {
    super(new A007602());
    next();
  }
}
