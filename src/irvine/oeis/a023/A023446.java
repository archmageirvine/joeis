package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023446 n-4.
 * @author Sean A. Irvine
 */
public class A023446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023446() {
    super(new long[] {-1, 2}, new long[] {-4, -3});
  }
}
