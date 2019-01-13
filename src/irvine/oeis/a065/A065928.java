package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065928.
 * @author Sean A. Irvine
 */
public class A065928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065928() {
    super(new long[] {1, -7, 7}, new long[] {2, 11, 63});
  }
}
