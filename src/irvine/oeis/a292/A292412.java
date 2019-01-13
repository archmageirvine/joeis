package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292412.
 * @author Sean A. Irvine
 */
public class A292412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292412() {
    super(new long[] {-1, 0, 3, 0}, new long[] {1, 1, 2, 4});
  }
}
