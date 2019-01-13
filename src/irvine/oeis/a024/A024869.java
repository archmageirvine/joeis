package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024869.
 * @author Sean A. Irvine
 */
public class A024869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024869() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {8, 10, 27, 32, 61, 70, 114});
  }
}
