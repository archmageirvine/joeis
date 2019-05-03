package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252986 Numbers n such that the heptagonal number <code>H(n)</code> is equal to the sum of the hexagonal numbers <code>X(m)</code> and <code>X(m+1)</code> for some m.
 * @author Sean A. Irvine
 */
public class A252986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252986() {
    super(new long[] {1, -1, -1442, 1442, 1}, new long[] {2, 733, 2366, 1056553, 3411338});
  }
}
