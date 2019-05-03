package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252985 Numbers n such that the sum of the hexagonal numbers <code>X(n)</code> and <code>X(n+1)</code> is equal to the heptagonal number <code>H(m)</code> for some m.
 * @author Sean A. Irvine
 */
public class A252985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252985() {
    super(new long[] {1, -1, -1442, 1442, 1}, new long[] {1, 579, 1870, 835278, 2696899});
  }
}
