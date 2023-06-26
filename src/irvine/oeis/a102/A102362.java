package irvine.oeis.a102;

import irvine.oeis.FiniteSequence;

/**
 * A102362 This finite sequence describes itself completely: there is 1 "0" in it, 1 "3", 1 "4", ..., 2 "2" and 11 "1".
 * @author Georg Fischer
 */
public class A102362 extends FiniteSequence {

  /** Construct the sequence. */
  public A102362() {
    super(1, FINITE, 10, 13, 14, 15, 16, 17, 18, 19, 22, 111);
  }
}
