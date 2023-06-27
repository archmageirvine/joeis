package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253305 Numbers n such that the octagonal number O(n) is equal to the sum of the heptagonal numbers H(m) and H(m+1) for some m.
 * @author Sean A. Irvine
 */
public class A253305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253305() {
    super(1, new long[] {1, -1, -62, 62, 1}, new long[] {2, 29, 100, 1777, 6178});
  }
}
