package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155086 Numbers k such that k^2 == -1 (mod 13).
 * @author Sean A. Irvine
 */
public class A155086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155086() {
    super(1, new long[] {-1, 1, 1}, new long[] {5, 8, 18});
  }
}
