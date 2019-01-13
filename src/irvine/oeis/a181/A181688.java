package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181688.
 * @author Sean A. Irvine
 */
public class A181688 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181688() {
    super(new long[] {1, -2, 2, 2}, new long[] {1, 1, 4, 8});
  }
}
