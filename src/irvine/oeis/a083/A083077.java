package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083077 Fifth row of number array A083075.
 * @author Sean A. Irvine
 */
public class A083077 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083077() {
    super(new long[] {-11, 12}, new long[] {1, 9});
  }
}
