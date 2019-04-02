package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251927 Numbers n such that the sum of the triangular numbers T(n) and T(n+1) is equal to a heptagonal number H(m) for some m.
 * @author Sean A. Irvine
 */
public class A251927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251927() {
    super(new long[] {1, -1, 0, -1442, 1442, 0, 1}, new long[] {0, 8, 76, 1518, 12986, 111034, 2190396});
  }
}
