package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133284.
 * @author Sean A. Irvine
 */
public class A133284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133284() {
    super(new long[] {1, -23, 23}, new long[] {1, 13, 277});
  }
}
