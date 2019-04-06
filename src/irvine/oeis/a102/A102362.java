package irvine.oeis.a102;

import irvine.oeis.FiniteSequence;

/**
 * A102362 This finite sequence describes itself completely: there is 1 &quot;0&quot; in it, 1 &quot;3&quot;, 1 &quot;4&quot;, ..., 2 &quot;2&quot; and 11 &quot;1&quot;.
 * @author Georg Fischer
 */
public class A102362 extends FiniteSequence {

  /** Construct the sequence. */
  public A102362() {
    super(10, 13, 14, 15, 16, 17, 18, 19, 22, 111);
  }
}
