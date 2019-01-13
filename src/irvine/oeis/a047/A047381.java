package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047381.
 * @author Sean A. Irvine
 */
public class A047381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047381() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 2, 4, 5, 7});
  }
}
