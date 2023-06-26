package irvine.oeis.a102;

import irvine.oeis.FiniteSequence;

/**
 * A102361 This finite sequence describes itself completely: there is 1 "0" in it, 1 "4", 1 "5", ..., 3 "2" and 7 "1".
 * @author Georg Fischer
 */
public class A102361 extends FiniteSequence {

  /** Construct the sequence. */
  public A102361() {
    super(1, FINITE, 10, 14, 15, 16, 18, 19, 23, 27, 32, 71);
  }
}
