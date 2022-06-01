package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099479 Count, repeating 4n three times for n &gt; 0.
 * @author Sean A. Irvine
 */
public class A099479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099479() {
    super(new long[] {-1, 2, -2, 2, -2, 2}, new long[] {0, 1, 2, 3, 4, 4});
  }
}
