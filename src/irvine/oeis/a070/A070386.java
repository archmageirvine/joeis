package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070386 a(n) = 5^n mod 39.
 * @author Sean A. Irvine
 */
public class A070386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070386() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 5, 25, 8});
  }
}
