package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047201 Numbers not divisible by 5.
 * @author Sean A. Irvine
 */
public class A047201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047201() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {1, 2, 3, 4, 6});
  }
}
