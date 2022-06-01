package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147678 Double, add 0, double, add 1, double, add 2, double, add 3, etc.
 * @author Sean A. Irvine
 */
public class A147678 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147678() {
    super(new long[] {2, 0, -5, 0, 4, 0}, new long[] {1, 2, 2, 4, 5, 10});
  }
}
