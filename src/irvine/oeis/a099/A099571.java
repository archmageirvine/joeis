package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099571.
 * @author Sean A. Irvine
 */
public class A099571 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099571() {
    super(new long[] {-1, -1, 4, 3, -6, -3, 4, 1}, new long[] {1, 1, 5, 6, 17, 23, 50, 73});
  }
}
