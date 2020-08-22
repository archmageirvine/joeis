package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015540 a(n) = 5*a(n-1) + 6*a(n-2), a(0) = 0, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A015540 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015540() {
    super(new long[] {6, 5}, new long[] {0, 1});
  }
}
