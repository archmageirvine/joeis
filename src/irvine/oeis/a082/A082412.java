package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082412 <code>a(n) = (2*8^n + 2^n)/3</code>.
 * @author Sean A. Irvine
 */
public class A082412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082412() {
    super(new long[] {-16, 10}, new long[] {1, 6});
  }
}
