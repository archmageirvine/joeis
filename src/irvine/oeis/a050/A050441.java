package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050441 Partial sums of <code>A051865</code>.
 * @author Sean A. Irvine
 */
public class A050441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050441() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 14, 50});
  }
}
