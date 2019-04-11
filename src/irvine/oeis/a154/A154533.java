package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154533 Number of constants of the form a^3*u + b*c*v, where <code>a,</code> b, c are linear, u of order <code>n-3</code> and v of order <code>n-2</code>.
 * @author Sean A. Irvine
 */
public class A154533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154533() {
    super(new long[] {1, -3, 3}, new long[] {10, 9, 10});
  }
}
