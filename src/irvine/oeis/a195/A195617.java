package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195617.
 * @author Sean A. Irvine
 */
public class A195617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195617() {
    super(new long[] {-1, 37, 37}, new long[] {35, 1333, 50615});
  }
}
