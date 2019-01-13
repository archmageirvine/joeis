package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029289.
 * @author Sean A. Irvine
 */
public class A029289 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029289() {
    super(new long[] {-1, 0, 0, 1, 0, 1, 0, 0, -1, 0, 1, 1, 0, -1, -1, -1, -1, 0, 1, 1, 0, -1, 0, 0, 1, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 2, 2, 1, 2, 2, 3, 3, 2, 3, 3, 5, 5, 4, 5, 5, 7, 7, 6, 7});
  }
}
