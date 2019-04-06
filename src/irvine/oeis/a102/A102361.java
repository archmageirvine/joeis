package irvine.oeis.a102;

import irvine.oeis.FiniteSequence;

/**
 * A102361 This finite sequence describes itself completely: there is 1 &quot;0&quot; in it, 1 &quot;4&quot;, 1 &quot;5&quot;, ..., 3 &quot;2&quot; and 7 &quot;1&quot;.
 * @author Georg Fischer
 */
public class A102361 extends FiniteSequence {

  /** Construct the sequence. */
  public A102361() {
    super(10, 14, 15, 16, 18, 19, 23, 27, 32, 71);
  }
}
