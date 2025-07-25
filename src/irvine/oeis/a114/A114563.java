package irvine.oeis.a114;

import irvine.oeis.recur.PaddingSequence;

/**
 * A114563 Number of "escalator" lattices in dimension n.
 * @author Georg Fischer
 */
public class A114563 extends PaddingSequence {

  /** Construct the sequence. */
  public A114563() {
    super(new long[] {1, 1, 2, 9, 207, 1630}, new long[] {0});
  }
}
