package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047327.
 * @author Sean A. Irvine
 */
public class A047327 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047327() {
    super(new long[] {-1, 1, 0, 1}, new long[] {3, 5, 6, 10});
  }
}
