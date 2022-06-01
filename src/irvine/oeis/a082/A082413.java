package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082413 a(n) = (2*9^n + 3^n)/3.
 * @author Sean A. Irvine
 */
public class A082413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082413() {
    super(new long[] {-27, 12}, new long[] {1, 7});
  }
}
