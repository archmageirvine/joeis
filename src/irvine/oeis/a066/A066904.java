package irvine.oeis.a066;
// Generated by gen_seq4.pl filterm/filter at 2023-09-11 18:58

import irvine.oeis.FilterSequence;
import irvine.oeis.a006.A006577;

/**
 * A066904 Triangular numbers in A006577.
 * @author Georg Fischer
 */
public class A066904 extends FilterSequence {

  /** Construct the sequence. */
  public A066904() {
    super(0, new A006577(), TRIANGULAR);
    skip(1);
  }
}
