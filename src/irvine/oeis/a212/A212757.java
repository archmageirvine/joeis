package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212757.
 * @author Sean A. Irvine
 */
public class A212757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212757() {
    super(new long[] {-1, -1, 1, 4, 3, -3, -6, -3, 3, 4, 1, -1}, new long[] {1, 1, 13, 32, 56, 80, 177, 213, 297, 472, 580, 688});
  }
}
