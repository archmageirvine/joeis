package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155041 Diagonal sums of symmetric (1,-1)-triangle A155040.
 * @author Sean A. Irvine
 */
public class A155041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155041() {
    super(new long[] {1, 0, -1, 1, 0}, new long[] {1, 1, 2, 0, 1});
  }
}
