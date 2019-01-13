package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243212.
 * @author Sean A. Irvine
 */
public class A243212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243212() {
    super(new long[] {1, -6, 14, -14, 0, 14, -14, 6}, new long[] {0, 15, 107, 428, 1282, 3198, 7022, 14020});
  }
}
