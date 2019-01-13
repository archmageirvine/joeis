package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047351.
 * @author Sean A. Irvine
 */
public class A047351 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047351() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 2, 4, 7});
  }
}
