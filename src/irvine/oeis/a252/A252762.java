package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252762 Numbers n such that the sum of the pentagonal numbers P(n), P(n+1), P(n+2) and P(n+3) is equal to the hexagonal number H(m) for some m.
 * @author Sean A. Irvine
 */
public class A252762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252762() {
    super(new long[] {1, -195, 195}, new long[] {3, 853, 165735});
  }
}
