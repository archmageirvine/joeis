package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083074 <code>n^3 - n^2 - n - 1</code>.
 * @author Sean A. Irvine
 */
public class A083074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083074() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-1, -2, 1, 14});
  }
}
