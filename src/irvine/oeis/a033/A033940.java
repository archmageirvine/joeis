package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033940 <code>a(n) = 10^n mod 7</code>.
 * @author Sean A. Irvine
 */
public class A033940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033940() {
    super(new long[] {1, -1, 0, 1}, new long[] {1, 3, 2, 6});
  }
}
