package irvine.oeis.a102;

import irvine.oeis.FiniteSequence;

/**
 * A102362 This finite sequence describes itself completely: there is <code>1 "0"</code> in it, <code>1 "3", 1 "4"</code>, ..., <code>2 "2"</code> and <code>11 "1"</code>.
 * @author Georg Fischer
 */
public class A102362 extends FiniteSequence {

  /** Construct the sequence. */
  public A102362() {
    super(10, 13, 14, 15, 16, 17, 18, 19, 22, 111);
  }
}
