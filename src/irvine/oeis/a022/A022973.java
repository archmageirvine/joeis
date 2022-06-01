package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022973 17-n.
 * @author Sean A. Irvine
 */
public class A022973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022973() {
    super(new long[] {-1, 2}, new long[] {17, 16});
  }
}
