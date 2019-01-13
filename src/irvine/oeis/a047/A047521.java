package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047521.
 * @author Sean A. Irvine
 */
public class A047521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047521() {
    super(new long[] {-1, 1, 1}, new long[] {0, 7, 8});
  }
}
