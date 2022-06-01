package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145130 2 + (89040 + (71868 + (29932 + (8449 + (1960 + (322 + (28 + n)*n)*n)*n)*n)*n)*n)*n/40320.
 * @author Sean A. Irvine
 */
public class A145130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145130() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {2, 7, 25, 81, 236, 622, 1498, 3334, 6931});
  }
}
