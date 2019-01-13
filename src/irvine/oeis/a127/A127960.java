package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127960.
 * @author Sean A. Irvine
 */
public class A127960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127960() {
    super(new long[] {27, -27, 9}, new long[] {0, 3, 36});
  }
}
