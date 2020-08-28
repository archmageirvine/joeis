package irvine.oeis.a070;
// Generated by gen_seq4.pl diffseq at 2020-08-28 13:59
// DO NOT EDIT here!

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a002.A002487;

/**
 * A070990 First differences of A002487.
 * @author Georg Fischer
 */
public class A070990 extends DifferenceSequence {

  /** Construct the sequence. */
  public A070990() {
    super(new A002487());
    next(); next();
  }
}
