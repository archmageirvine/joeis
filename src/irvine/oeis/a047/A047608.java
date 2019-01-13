package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047608.
 * @author Sean A. Irvine
 */
public class A047608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047608() {
    super(new long[] {-1, 1, 1}, new long[] {4, 5, 12});
  }
}
