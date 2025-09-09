package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253121 Numbers k such that the hexagonal number H(k) is equal to the sum of the octagonal numbers O(m), O(m+1), O(m+2) and O(m+3) for some m.
 * @author Sean A. Irvine
 */
public class A253121 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253121() {
    super(1, new long[] {1, -99, 99}, new long[] {18, 1730, 169498});
  }
}
