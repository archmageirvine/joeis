package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116415 <code>a(n) = 5a(n-1) - 3a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A116415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116415() {
    super(new long[] {-3, 5}, new long[] {1, 5});
  }
}
