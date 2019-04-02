package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179741 a(n) = (2*n+1)*(6*n-1).
 * @author Sean A. Irvine
 */
public class A179741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179741() {
    super(new long[] {1, -3, 3}, new long[] {-1, 15, 55});
  }
}
