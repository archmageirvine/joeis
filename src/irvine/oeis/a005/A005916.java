package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005916 Molien series for a certain group of order 52.
 * @author Sean A. Irvine
 */
public class A005916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005916() {
    super(new long[] {-1, 1, 1, -1, 1, -1, -1, 1, 0, 0, 0, 0, 0, 1, -1, -1, 1, -1, 1, 1},
      new long[] {1, 0, 1, 0, 2, 1, 3, 2, 5, 4, 7, 7, 11, 11, 15, 16, 21, 22, 28, 30});
  }
}

