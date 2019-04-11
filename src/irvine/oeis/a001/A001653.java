package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001653 Numbers k such that 2*k^2 <code>- 1</code> is a square.
 * @author Sean A. Irvine
 */
public class A001653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001653() {
    super(new long[] {-1, 6}, new long[] {1, 5});
  }
}
