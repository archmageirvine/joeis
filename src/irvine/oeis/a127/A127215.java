package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127215.
 * @author Sean A. Irvine
 */
public class A127215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127215() {
    super(new long[] {27, 9, 3}, new long[] {3, 27, 189});
  }
}
