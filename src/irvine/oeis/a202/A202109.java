package irvine.oeis.a202;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A202109 n^3*(n+1)^3*(n+2)^3/72.
 * @author Sean A. Irvine
 */
public class A202109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202109() {
    super(1, new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {3, 192, 3000, 24000, 128625, 526848, 1778112, 5184000, 13476375, 31944000});
  }
}
