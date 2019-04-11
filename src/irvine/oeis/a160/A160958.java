package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160958 <code>a(n) = (9^n - (-7)^n)/(9 - (-7))</code>.
 * @author Sean A. Irvine
 */
public class A160958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160958() {
    super(new long[] {63, 2}, new long[] {1, 2});
  }
}
