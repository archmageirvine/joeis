package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015610 a(n) = 12*a(n-1) + 5*a(n-2).
 * @author Sean A. Irvine
 */
public class A015610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015610() {
    super(new long[] {5, 12}, new long[] {0, 1});
  }
}
