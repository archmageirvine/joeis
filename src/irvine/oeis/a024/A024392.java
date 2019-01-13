package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024392.
 * @author Sean A. Irvine
 */
public class A024392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024392() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {80, 806, 4040, 14155, 39655, 95200, 204036});
  }
}
