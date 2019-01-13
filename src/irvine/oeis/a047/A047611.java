package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047611.
 * @author Sean A. Irvine
 */
public class A047611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047611() {
    super(new long[] {-1, 1, 0, 1}, new long[] {2, 4, 5, 10});
  }
}
