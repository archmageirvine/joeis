package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252762 Numbers n such that the sum of the pentagonal numbers <code>P(n), P(n+1), P(n+2)</code> and <code>P(n+3)</code> is equal to the hexagonal number <code>H(m)</code> for some m.
 * @author Sean A. Irvine
 */
public class A252762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252762() {
    super(new long[] {1, -195, 195}, new long[] {3, 853, 165735});
  }
}
