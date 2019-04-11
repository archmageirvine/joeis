package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071619 <code>a(n) =</code> ceiling( <code>2*n^2/3 )</code>.
 * @author Sean A. Irvine
 */
public class A071619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071619() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {0, 1, 3, 6, 11});
  }
}
