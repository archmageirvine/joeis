package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020838.
 * @author Sean A. Irvine
 */
public class A020838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020838() {
    super(new long[] {560, -206, 25}, new long[] {1, 25, 419});
  }
}
