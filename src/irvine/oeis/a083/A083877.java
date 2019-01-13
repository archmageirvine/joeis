package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083877.
 * @author Sean A. Irvine
 */
public class A083877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083877() {
    super(new long[] {-9, -3, 5}, new long[] {1, 5, 25});
  }
}
