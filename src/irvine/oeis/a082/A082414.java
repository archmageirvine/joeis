package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082414 <code>a(n) = (2*10^n + 4^n)/3</code>.
 * @author Sean A. Irvine
 */
public class A082414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082414() {
    super(new long[] {-40, 14}, new long[] {1, 8});
  }
}
