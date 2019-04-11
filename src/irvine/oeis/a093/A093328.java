package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093328 <code>a(n) = 2*n^2 + 3</code>.
 * @author Sean A. Irvine
 */
public class A093328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093328() {
    super(new long[] {1, -3, 3}, new long[] {3, 5, 11});
  }
}
