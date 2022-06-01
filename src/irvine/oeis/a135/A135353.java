package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135353 a(n) = 3*a(n-1) - 3*a(n-2) + 2*a(n-3).
 * @author Sean A. Irvine
 */
public class A135353 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135353() {
    super(new long[] {2, -3, 3}, new long[] {2, -3, 3});
  }
}
