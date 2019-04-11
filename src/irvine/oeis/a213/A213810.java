package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213810 <code>a(n) = 4*n^2 - 482*n + 14561</code>.
 * @author Sean A. Irvine
 */
public class A213810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213810() {
    super(new long[] {1, -3, 3}, new long[] {14561, 14083, 13613});
  }
}
