package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047254.
 * @author Sean A. Irvine
 */
public class A047254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047254() {
    super(new long[] {-1, 1, 0, 1}, new long[] {2, 3, 5, 8});
  }
}
