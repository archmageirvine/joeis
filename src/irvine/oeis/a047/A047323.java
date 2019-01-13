package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047323.
 * @author Sean A. Irvine
 */
public class A047323 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047323() {
    super(new long[] {-1, 1, 0, 1}, new long[] {2, 5, 6, 9});
  }
}
