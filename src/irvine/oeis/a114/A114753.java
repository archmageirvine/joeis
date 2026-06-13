package irvine.oeis.a114;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A114753 a(n) = n if odd, else 2n-1.
 * @author Sean A. Irvine
 */
public class A114753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114753() {
    super(1, new long[] {-1, 0, 2, 0}, new long[] {1, 3, 3, 7});
  }
}
