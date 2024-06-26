package irvine.oeis.a117;
// Generated by gen_seq4.pl 2024-03-27/filter at 2024-03-27 21:37

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000566;

/**
 * A117993 Heptagonal numbers with only odd digits.
 * @author Georg Fischer
 */
public class A117993 extends FilterSequence {

  /** Construct the sequence. */
  public A117993() {
    super(1, new A000566(), v -> v.toString().matches("[13579]+"));
  }
}
