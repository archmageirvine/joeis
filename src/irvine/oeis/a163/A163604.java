package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163604 <code>a(n) = ((3+2*sqrt(2))*(4+sqrt(2))^n + (3-2*sqrt(2))*(4-sqrt(2))^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A163604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163604() {
    super(new long[] {-14, 8}, new long[] {3, 16});
  }
}
