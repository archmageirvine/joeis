package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155097 Numbers k such that k^2 == -1 (mod 37).
 * @author Sean A. Irvine
 */
public class A155097 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155097() {
    super(new long[] {-1, 1, 1}, new long[] {6, 31, 43});
  }
}
