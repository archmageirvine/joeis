package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026054 dot_product(n,n-1,...2,1).(3,4,...,n,1,2).
 * @author Sean A. Irvine
 */
public class A026054 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026054() {
    super(new long[] {-1, 4, -6, 4}, new long[] {13, 28, 50, 80});
  }
}
