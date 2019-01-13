package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131026.
 * @author Sean A. Irvine
 */
public class A131026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131026() {
    super(new long[] {1, -2, 2}, new long[] {2, 2, 1});
  }
}
