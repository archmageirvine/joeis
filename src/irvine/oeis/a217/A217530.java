package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217530 <code>n^4/2-5*n^3/2+21*n-30</code>.
 * @author Sean A. Irvine
 */
public class A217530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217530() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 6, 22, 75, 204});
  }
}
