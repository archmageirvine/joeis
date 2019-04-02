package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214446 n*(n^2-2*n-1).
 * @author Sean A. Irvine
 */
public class A214446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214446() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-2, -2, 6, 28});
  }
}
