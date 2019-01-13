package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047270.
 * @author Sean A. Irvine
 */
public class A047270 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047270() {
    super(new long[] {-1, 1, 1}, new long[] {3, 5, 9});
  }
}
