package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255501.
 * @author Sean A. Irvine
 */
public class A255501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255501() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 1, 352, 9909, 107776, 698125, 3252096, 12045817, 37679104, 103495401});
  }
}
