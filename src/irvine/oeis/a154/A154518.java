package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154518 <code>a(n) = 216*n - 12</code>.
 * @author Sean A. Irvine
 */
public class A154518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154518() {
    super(new long[] {-1, 2}, new long[] {204, 420});
  }
}
