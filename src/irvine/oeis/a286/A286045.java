package irvine.oeis.a286;
// Generated by gen_seq4.pl compseq at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.ComplementSequence;
import irvine.oeis.a003.A003157;

/**
 * A286045 Positions of 0 in A286044; complement of A003157.
 * @author Georg Fischer
 */
public class A286045 extends ComplementSequence {

  /** Construct the sequence. */
  public A286045() {
    super(new A003157());
    next();
  }
}
