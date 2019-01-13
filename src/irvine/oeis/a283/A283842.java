package irvine.oeis.a283;

import irvine.oeis.LinearRecurrence;

/**
 * A283842.
 * @author Sean A. Irvine
 */
public class A283842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A283842() {
    super(new long[] {10, -35, 47, -30, 9}, new long[] {0, 0, 0, 2, 15});
  }
}
