package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252586 Numbers n such that the heptagonal number H(n) is equal to the sum of the pentagonal numbers P(m) and P(m+1) for some m.
 * @author Sean A. Irvine
 */
public class A252586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252586() {
    super(new long[] {1, -1, -482, 482, 1}, new long[] {4, 257, 1772, 123729, 853956});
  }
}
