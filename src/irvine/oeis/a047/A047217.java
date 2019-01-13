package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047217.
 * @author Sean A. Irvine
 */
public class A047217 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047217() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 1, 2, 5});
  }
}
