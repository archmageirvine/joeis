package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070353 a(n) = 3^n mod 14.
 * @author Sean A. Irvine
 */
public class A070353 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070353() {
    super(new long[] {1, -2, 2}, new long[] {1, 3, 9});
  }
}
