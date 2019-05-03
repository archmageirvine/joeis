package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079282 Diagonal sums of triangle <code>A055249</code>.
 * @author Sean A. Irvine
 */
public class A079282 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079282() {
    super(new long[] {4, 0, -7, 5}, new long[] {1, 3, 9, 24});
  }
}
