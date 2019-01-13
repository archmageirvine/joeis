package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140162.
 * @author Sean A. Irvine
 */
public class A140162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140162() {
    super(new long[] {1, -1, -6, 6, 15, -15, -20, 20, 15, -15, -6, 6, 1}, new long[] {1, 2, 245, 246, 3371, 3372, 20179, 20180, 79229, 79230, 240281, 240282, 611575});
  }
}
