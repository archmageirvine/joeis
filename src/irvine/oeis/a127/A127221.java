package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127221.
 * @author Sean A. Irvine
 */
public class A127221 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127221() {
    super(new long[] {32, 16, 8, 4, 2}, new long[] {2, 12, 56, 240, 992});
  }
}
