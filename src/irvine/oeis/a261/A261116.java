package irvine.oeis.a261;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A261116 Pairs of integers (a,b) such a^2 + (a+1)^2 = b^2.
 * @author Sean A. Irvine
 */
public class A261116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261116() {
    super(1, new long[] {1, 0, -7, 0, 7, 0}, new long[] {0, 1, 3, 5, 20, 29});
  }
}
