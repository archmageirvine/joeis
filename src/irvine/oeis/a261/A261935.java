package irvine.oeis.a261;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A261935 The first of seventeen consecutive positive integers the sum of the squares of which is equal to the sum of the squares of two consecutive positive integers.
 * @author Sean A. Irvine
 */
public class A261935 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261935() {
    super(1, new long[] {1, -1, -70, 70, 1}, new long[] {5, 23, 933, 2175, 65849});
  }
}
