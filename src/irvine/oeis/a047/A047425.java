package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047425.
 * @author Sean A. Irvine
 */
public class A047425 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047425() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {3, 4, 5, 6, 11});
  }
}
