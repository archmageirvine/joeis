package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132356 <code>a(2*k) = k*(10*k+2), a(2*k+1) = 10*k^2 + 18*k + 8</code>, with k <code>&gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A132356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132356() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 8, 12, 36, 44});
  }
}
