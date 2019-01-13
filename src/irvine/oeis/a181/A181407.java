package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181407.
 * @author Sean A. Irvine
 */
public class A181407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181407() {
    super(new long[] {8, -12, 6}, new long[] {3, 3, 2});
  }
}
