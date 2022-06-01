package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081680 A sum of decreasing powers.
 * @author Sean A. Irvine
 */
public class A081680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081680() {
    super(new long[] {2520, -2754, 1175, -245, 25}, new long[] {1, 2, 4, 23, 274});
  }
}
