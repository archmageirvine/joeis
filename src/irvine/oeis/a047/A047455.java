package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047455.
 * @author Sean A. Irvine
 */
public class A047455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047455() {
    super(new long[] {-1, 1, 0, 1}, new long[] {2, 3, 4, 10});
  }
}
