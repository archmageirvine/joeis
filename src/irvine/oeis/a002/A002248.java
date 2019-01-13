package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002248.
 * @author Sean A. Irvine
 */
public class A002248 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002248() {
    super(new long[] {-4, 8, -7, 4}, new long[] {2, 8, 14, 16});
  }
}
