package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033428 <code>a(n) = 3*n^2</code>.
 * @author Sean A. Irvine
 */
public class A033428 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033428() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 12});
  }
}
