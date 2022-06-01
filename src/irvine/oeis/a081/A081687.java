package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081687 A sum of decreasing powers.
 * @author Sean A. Irvine
 */
public class A081687 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081687() {
    super(new long[] {6720, -5944, 2070, -355, 30}, new long[] {1, 2, 2, 20, 542});
  }
}
