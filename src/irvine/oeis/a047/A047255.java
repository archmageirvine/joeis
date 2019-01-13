package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047255.
 * @author Sean A. Irvine
 */
public class A047255 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047255() {
    super(new long[] {-1, 2, -2, 2}, new long[] {1, 2, 3, 5});
  }
}
