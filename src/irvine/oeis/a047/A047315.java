package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047315.
 * @author Sean A. Irvine
 */
public class A047315 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047315() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {2, 4, 5, 6, 9});
  }
}
