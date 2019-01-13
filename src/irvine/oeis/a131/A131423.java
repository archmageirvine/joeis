package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131423.
 * @author Sean A. Irvine
 */
public class A131423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131423() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 8, 25, 56});
  }
}
