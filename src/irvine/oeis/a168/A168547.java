package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168547 <code>a(n) = 1 - 2*n^2 + 4*n*(1 + 2*n^2)/3</code>.
 * @author Sean A. Irvine
 */
public class A168547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168547() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 3, 17, 59});
  }
}
