package irvine.oeis.a081;
// Generated by gen_seq4.pl filtpos at 2023-09-08 10:19

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a046.A046073;

/**
 * A081754 Numbers n such that the number of noncongruent solutions to x^(2^m) == 1 (mod n) is the same for any m&gt;=1.
 * @author Georg Fischer
 */
public class A081754 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A081754() {
    super(1, 1, new A046073(), ODD);
  }
}
