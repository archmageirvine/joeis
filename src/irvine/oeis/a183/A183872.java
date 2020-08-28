package irvine.oeis.a183;
// Generated by gen_seq4.pl compseq at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.ComplementSequence;

/**
 * A183872 n+floor(sqrt(5n)); complement of A183873.
 * @author Georg Fischer
 */
public class A183872 extends ComplementSequence {

  /** Construct the sequence. */
  public A183872() {
    super(new A183873());
    next();
  }
}
