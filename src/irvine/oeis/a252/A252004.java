package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252004 Numbers n such that the sum of the pentagonal numbers <code>P(n)</code> and <code>P(n+1)</code> is equal to the sum of the octagonal numbers <code>N(m)</code> and <code>N(m+1)</code> for some m.
 * @author Sean A. Irvine
 */
public class A252004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252004() {
    super(new long[] {1, -1155, 1155}, new long[] {328, 378896, 437246040});
  }
}
