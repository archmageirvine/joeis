package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057769.
 * @author Sean A. Irvine
 */
public class A057769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057769() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {-1, 7, 119, 527, 1519});
  }
}
