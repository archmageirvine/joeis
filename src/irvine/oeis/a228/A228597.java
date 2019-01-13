package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228597.
 * @author Sean A. Irvine
 */
public class A228597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228597() {
    super(new long[] {1, -3, 3}, new long[] {141, 445, 941});
  }
}
