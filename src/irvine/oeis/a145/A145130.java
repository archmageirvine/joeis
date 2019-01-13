package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145130.
 * @author Sean A. Irvine
 */
public class A145130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145130() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {2, 7, 25, 81, 236, 622, 1498, 3334, 6931});
  }
}
