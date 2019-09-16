package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093969 <code>a(n) = n*Pell(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A093969 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093969() {
    super(new long[] {-1, -4, -2, 4}, new long[] {0, 1, 0, 3});
  }
}
