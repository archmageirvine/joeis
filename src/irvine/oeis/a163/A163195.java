package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163195.
 * @author Sean A. Irvine
 */
public class A163195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163195() {
    super(new long[] {-1, 20, -35, -35, 20}, new long[] {0, 0, 28, 539, 9801});
  }
}
