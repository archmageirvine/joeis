package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164856.
 * @author Sean A. Irvine
 */
public class A164856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164856() {
    super(new long[] {-100, -100, 101, 1}, new long[] {1, 102, 103, 10204});
  }
}
