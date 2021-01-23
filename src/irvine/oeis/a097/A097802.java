package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097802 a(n) = 3*(25*n + 1).
 * @author Sean A. Irvine
 */
public class A097802 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097802() {
    super(new long[] {-1, 2}, new long[] {3, 78});
  }
}
