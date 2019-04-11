package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168635 <code>a(n) = n^7*(n + 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A168635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168635() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 1, 192, 4374, 40960, 234375, 979776, 3294172, 9437184});
  }
}
