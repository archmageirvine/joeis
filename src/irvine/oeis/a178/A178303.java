package irvine.oeis.a178;

import irvine.oeis.FiniteSequence;

/**
 * A178303 Smallest multiple of 13 such that decimals digits <code>1, ..., k (k = 1, ..., 9)</code> and 0 appear in any order.
 * @author Georg Fischer
 */
public class A178303 extends FiniteSequence {

  /** Construct the sequence. */
  public A178303() {
    super(13, 182, 312, 2314, 14235, 125346, 1234675, 12348765, 123456879L, 1023457968L);
  }
}
