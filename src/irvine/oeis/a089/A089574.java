package irvine.oeis.a089;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A089574 Column 4 of an array closely related to A083480. (Both arrays have shape sequence A083479).
 * @author Sean A. Irvine
 */
public class A089574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089574() {
    super(1, new long[] {-1, 6, -15, 20, -15, 6}, new long[] {5, 32, 113, 299, 664, 1309});
  }
}
