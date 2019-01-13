package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192754.
 * @author Sean A. Irvine
 */
public class A192754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192754() {
    super(new long[] {-1, 0, 2}, new long[] {1, 6, 12});
  }
}
