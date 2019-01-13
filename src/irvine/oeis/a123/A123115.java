package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123115.
 * @author Sean A. Irvine
 */
public class A123115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123115() {
    super(new long[] {-1, 40, -206, 40}, new long[] {0, 2, 96, 3430});
  }
}
