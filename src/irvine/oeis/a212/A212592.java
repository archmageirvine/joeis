package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212592.
 * @author Sean A. Irvine
 */
public class A212592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212592() {
    super(new long[] {7, 0, -35, 0, 21, 0}, new long[] {1, 6, 11, 106, 201, 2022});
  }
}
