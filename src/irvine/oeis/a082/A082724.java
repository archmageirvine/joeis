package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082724 a(n) = (3*11^n + 3^n)/4.
 * @author Sean A. Irvine
 */
public class A082724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082724() {
    super(new long[] {-33, 14}, new long[] {1, 9});
  }
}
