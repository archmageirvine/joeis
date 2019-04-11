package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015528 <code>a(n) = 3*a(n-1) + 10*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A015528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015528() {
    super(new long[] {10, 3}, new long[] {0, 1});
  }
}
