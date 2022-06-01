package irvine.oeis.a234;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A234044 Period 7: repeat [2, -2, 1, 0, 0, 1, -2].
 * @author Sean A. Irvine
 */
public class A234044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234044() {
    super(new long[] {-1, -1, -1, -1, -1, -1}, new long[] {2, -2, 1, 0, 0, 1});
  }
}
