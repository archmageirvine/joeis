package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047566.
 * @author Sean A. Irvine
 */
public class A047566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047566() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {4, 5, 6, 7, 12});
  }
}
