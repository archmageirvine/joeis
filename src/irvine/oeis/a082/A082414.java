package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082414 a(n) = (2*10^n + 4^n)/3.
 * @author Sean A. Irvine
 */
public class A082414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082414() {
    super(new long[] {-40, 14}, new long[] {1, 8});
  }
}
