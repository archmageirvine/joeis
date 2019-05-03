package irvine.oeis.a102;

import irvine.oeis.FiniteSequence;

/**
 * A102361 This finite sequence describes itself completely: there is <code>1 "0"</code> in it, <code>1 "4", 1 "5"</code>, ..., <code>3 "2"</code> and <code>7 "1"</code>.
 * @author Georg Fischer
 */
public class A102361 extends FiniteSequence {

  /** Construct the sequence. */
  public A102361() {
    super(10, 14, 15, 16, 18, 19, 23, 27, 32, 71);
  }
}
