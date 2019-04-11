package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163610 <code>a(n) = ((5 + 2*sqrt(2))*(4 + sqrt(2))^n + (5 - 2*sqrt(2))*(4 - sqrt(2))^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A163610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163610() {
    super(new long[] {-14, 8}, new long[] {5, 24});
  }
}
