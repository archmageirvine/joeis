package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132353 <code>a(n) = 3*a(n-1) - a(n-3) + 3*a(n-4)</code>, starting with 1, 2, 6, 20.
 * @author Sean A. Irvine
 */
public class A132353 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132353() {
    super(new long[] {3, -1, 0, 3}, new long[] {1, 2, 6, 20});
  }
}
