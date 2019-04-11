package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082413 <code>a(n) = (2*9^n + 3^n)/3</code>.
 * @author Sean A. Irvine
 */
public class A082413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082413() {
    super(new long[] {-27, 12}, new long[] {1, 7});
  }
}
