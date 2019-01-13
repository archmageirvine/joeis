package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060791.
 * @author Sean A. Irvine
 */
public class A060791 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060791() {
    super(new long[] {-1, 0, 0, 0, 0, 2, 0, 0, 0, 0}, new long[] {1, 2, 3, 4, 1, 6, 7, 8, 9, 2});
  }
}
