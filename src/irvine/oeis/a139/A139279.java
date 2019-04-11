package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139279 <code>a(n) = 40*n - 32</code>.
 * @author Sean A. Irvine
 */
public class A139279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139279() {
    super(new long[] {-1, 2}, new long[] {8, 48});
  }
}
