package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047524.
 * @author Sean A. Irvine
 */
public class A047524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047524() {
    super(new long[] {-1, 1, 1}, new long[] {2, 7, 10});
  }
}
