package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083374.
 * @author Sean A. Irvine
 */
public class A083374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083374() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 6, 36, 120, 300});
  }
}
