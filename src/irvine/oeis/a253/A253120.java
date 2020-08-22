package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253120 Numbers n such that the sum of the octagonal numbers O(n), O(n+1), O(n+2) and O(n+3) is equal to the hexagonal number H(m) for some m.
 * @author Sean A. Irvine
 */
public class A253120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253120() {
    super(new long[] {1, -99, 99}, new long[] {6, 705, 69196});
  }
}
