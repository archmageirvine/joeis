package irvine.oeis.a089;
// Generated by gen_seq4.pl diffspp at 2020-09-22 15:10
// DO NOT EDIT here!

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a080.A080791;

/**
 * A089263 First differences of A080791.
 * @author Georg Fischer
 */
public class A089263 extends PrependSequence {

  /** Construct the sequence. */
  public A089263() {
    super(new DifferenceSequence(new A080791()), 0);
  }
}
