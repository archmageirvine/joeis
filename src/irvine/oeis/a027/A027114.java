package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027114 <code>a(n) = A027113(n, n+2)</code>.
 * @author Sean A. Irvine
 */
public class A027114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027114() {
    super(new long[] {-1, 0, 0, 2}, new long[] {3, 9, 20, 40});
  }
}
