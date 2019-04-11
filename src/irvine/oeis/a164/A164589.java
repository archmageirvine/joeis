package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164589 <code>a(n) = ((4 + 3*sqrt(2))*(1 + 2*sqrt(2))^n + (4 - 3*sqrt(2))*(1 - 2*sqrt(2))^n)/8</code>.
 * @author Sean A. Irvine
 */
public class A164589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164589() {
    super(new long[] {7, 2}, new long[] {1, 4});
  }
}
