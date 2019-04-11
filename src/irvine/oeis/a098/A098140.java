package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098140 63-gonal numbers: <code>a(n) = n*(61*n - 59)/2</code>.
 * @author Sean A. Irvine
 */
public class A098140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098140() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 63});
  }
}
