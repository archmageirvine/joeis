package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028078.
 * @author Sean A. Irvine
 */
public class A028078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028078() {
    super(new long[] {-1512, 1098, -273, 28}, new long[] {1, 28, 511, 7762});
  }
}
