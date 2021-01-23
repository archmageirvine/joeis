package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290124 a(n) = a(n-1) + 12*a(n-2) with a(1) = 1 and a(2) = 2.
 * @author Sean A. Irvine
 */
public class A290124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290124() {
    super(new long[] {12, 1}, new long[] {1, 2});
  }
}
