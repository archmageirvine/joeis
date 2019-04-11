package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186030 <code>a(n) = n*(13*n-3)/2</code>.
 * @author Sean A. Irvine
 */
public class A186030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186030() {
    super(new long[] {1, -3, 3}, new long[] {0, 5, 23});
  }
}
