package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179783 a(n) = 2*n*(n+1)*(n+2)/3 + (-1)^n.
 * @author Sean A. Irvine
 */
public class A179783 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179783() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 3, 17, 39, 81});
  }
}
