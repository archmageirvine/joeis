package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027850 a(n) = (n+1)*(14*n^3+13*n^2+6*n+1).
 * @author Sean A. Irvine
 */
public class A027850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027850() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 68, 531, 2056, 5645});
  }
}
