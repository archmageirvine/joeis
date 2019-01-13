package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065113.
 * @author Sean A. Irvine
 */
public class A065113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065113() {
    super(new long[] {1, -7, 7}, new long[] {6, 40, 238});
  }
}
