package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081552 Leading terms of rows in A081551.
 * @author Sean A. Irvine
 */
public class A081552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081552() {
    super(new long[] {10, -21, 12}, new long[] {1, 11, 102});
  }
}
