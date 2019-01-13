package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019274.
 * @author Sean A. Irvine
 */
public class A019274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019274() {
    super(new long[] {-1, 0, 2}, new long[] {0, 0, 2});
  }
}
