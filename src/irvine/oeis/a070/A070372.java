package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070372 <code>a(n) = 5^n mod 18</code>.
 * @author Sean A. Irvine
 */
public class A070372 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070372() {
    super(new long[] {1, -1, 0, 1}, new long[] {1, 5, 7, 17});
  }
}
