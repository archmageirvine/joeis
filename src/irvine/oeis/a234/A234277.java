package irvine.oeis.a234;

import irvine.oeis.LinearRecurrence;

/**
 * A234277 <code>a(n) =</code> binomial(floor(n/2),4)+(ceil(n/2)-3)*binomial(floor(n/2),3).
 * @author Sean A. Irvine
 */
public class A234277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234277() {
    super(new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1}, new long[] {0, 0, 0, 0, 0, 0, 0, 1, 5});
  }
}
