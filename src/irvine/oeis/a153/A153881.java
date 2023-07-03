package irvine.oeis.a153;
// manually

import irvine.oeis.recur.PaddingSequence;

/**
 * A153881 1 followed by -1, -1, -1, ... .
 * @author Georg Fischer
 */
public class A153881 extends PaddingSequence {

  /**
   * Construct the sequence
   */
  public A153881() {
    super(1, new long[]{1}, new long[]{-1});
  }
}
