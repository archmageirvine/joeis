package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237616 <code>a(n) = n*(n + 1)*(5*n - 4)/2</code>.
 * @author Sean A. Irvine
 */
public class A237616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237616() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 18, 66});
  }
}
