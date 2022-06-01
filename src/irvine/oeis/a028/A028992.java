package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028992 Even 9-gonal (or enneagonal) numbers.
 * @author Sean A. Irvine
 */
public class A028992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028992() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 24, 46, 154, 204});
  }
}
