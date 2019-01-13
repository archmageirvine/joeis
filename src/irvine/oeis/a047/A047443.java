package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047443.
 * @author Sean A. Irvine
 */
public class A047443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047443() {
    super(new long[] {-1, 1, 0, 1}, new long[] {3, 5, 6, 11});
  }
}
