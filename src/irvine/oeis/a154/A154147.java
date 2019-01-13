package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154147.
 * @author Sean A. Irvine
 */
public class A154147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154147() {
    super(new long[] {1, -1, -6, 6, 1}, new long[] {3, 9, 30, 60, 179});
  }
}
