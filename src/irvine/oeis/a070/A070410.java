package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070410 <code>a(n) = 7^n mod 25</code>.
 * @author Sean A. Irvine
 */
public class A070410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070410() {
    super(new long[] {1, -1, 1}, new long[] {1, 7, 24});
  }
}
