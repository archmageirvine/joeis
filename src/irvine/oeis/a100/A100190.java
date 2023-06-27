package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100190 The (4,1)-entry in the 4 X 4 matrix M^n, where M = [1,0,0,0 / 3,3,0,0 / 3,6,3,0 / 1,3,3,1].
 * @author Sean A. Irvine
 */
public class A100190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100190() {
    super(1, new long[] {-9, 24, -22, 8}, new long[] {1, 20, 147, 760});
  }
}
