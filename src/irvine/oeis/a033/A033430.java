package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033430 <code>a(n) = 4*n^3</code>.
 * @author Sean A. Irvine
 */
public class A033430 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033430() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 4, 32, 108});
  }
}
