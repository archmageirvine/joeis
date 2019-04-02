package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015533 a(n) = 4*a(n-1) + 9*a(n-2).
 * @author Sean A. Irvine
 */
public class A015533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015533() {
    super(new long[] {9, 4}, new long[] {0, 1});
  }
}
