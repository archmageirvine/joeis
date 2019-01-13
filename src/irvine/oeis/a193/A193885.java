package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193885.
 * @author Sean A. Irvine
 */
public class A193885 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193885() {
    super(new long[] {-1, 1, -3, 3}, new long[] {1, 1, 2, 3});
  }
}
