package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019992 <code>a(n) = 4*a(n-1) + a(n-2) - a(n-3) - a(n-5)</code>.
 * @author Sean A. Irvine
 */
public class A019992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019992() {
    super(new long[] {-1, 0, -1, 1, 4}, new long[] {5, 21, 88, 368, 1538});
  }
}
