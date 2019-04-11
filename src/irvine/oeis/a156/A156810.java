package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156810 <code>a(n) = 225*n^2 - 251*n + 70</code>.
 * @author Sean A. Irvine
 */
public class A156810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156810() {
    super(new long[] {1, -3, 3}, new long[] {70, 44, 468});
  }
}
