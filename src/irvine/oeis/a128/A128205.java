package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128205 <code>a(n) =</code> 2^(n-1)*A047240(n).
 * @author Sean A. Irvine
 */
public class A128205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128205() {
    super(new long[] {-16, 8, 0, 2}, new long[] {0, 1, 4, 24});
  }
}
