package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135350 <code>a(n) = 2*a(n-1) - a(n-3) + 2*a(n-4)</code>.
 * @author Sean A. Irvine
 */
public class A135350 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135350() {
    super(new long[] {2, -1, 0, 2}, new long[] {0, 1, 3, 8});
  }
}
