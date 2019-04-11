package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272128 <code>a(n) = 30240*n^5-25200*n^4+5040*n^3+7320*n^2-2638*n+1</code>.
 * @author Sean A. Irvine
 */
public class A272128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272128() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 14763, 628805, 5501167, 24943689, 79549811});
  }
}
