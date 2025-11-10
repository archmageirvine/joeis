package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253167 Numbers k such that the sum of the pentagonal numbers P(k), P(k+1), P(k+2) and P(k+3) is equal to the octagonal number O(m) for some m.
 * @author Sean A. Irvine
 */
public class A253167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253167() {
    super(1, new long[] {1, -1, -1154, 1154, 1}, new long[] {1, 871, 2841, 1006671, 3280049});
  }
}
