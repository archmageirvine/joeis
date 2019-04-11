package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073577 <code>a(n) = 4*n^2 + 4*n - 1</code>.
 * @author Sean A. Irvine
 */
public class A073577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073577() {
    super(new long[] {1, -3, 3}, new long[] {7, 23, 47});
  }
}
