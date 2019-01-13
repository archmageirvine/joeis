package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112851.
 * @author Sean A. Irvine
 */
public class A112851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112851() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 0, 3, 21, 81, 231});
  }
}
