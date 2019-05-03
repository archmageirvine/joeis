package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252769 Numbers n such that the sum of the pentagonal numbers <code>P(n), P(n+1), P(n+2)</code> and <code>P(n+3)</code> is equal to the heptagonal number <code>H(m)</code> for some m.
 * @author Sean A. Irvine
 */
public class A252769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252769() {
    super(new long[] {1, -63, 63}, new long[] {94, 5908, 366282});
  }
}
