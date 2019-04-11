package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050400 Number of independent sets of vertices in P_3 X C_n <code>(n &gt; 2)</code>.
 * @author Sean A. Irvine
 */
public class A050400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050400() {
    super(new long[] {-1, -1, 6, 8, 1}, new long[] {5, 1, 17, 43, 181});
  }
}
