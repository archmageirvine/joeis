package irvine.oeis.a275;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A275932 a(n) = F(2*n+6)*F(2*n+2)^3, where F = Fibonacci (A000045).
 * @author Sean A. Irvine
 */
public class A275932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275932() {
    super(new long[] {1, -55, 385, -385, 55}, new long[] {8, 567, 28160, 1333584, 62723375});
  }
}
