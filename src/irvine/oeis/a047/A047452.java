package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047452.
 * @author Sean A. Irvine
 */
public class A047452 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047452() {
    super(new long[] {-1, 1, 1}, new long[] {1, 6, 9});
  }
}
