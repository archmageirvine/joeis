package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252076 Numbers n such that the sum of the heptagonal numbers <code>H(n)</code> and <code>H(n+1)</code> is equal to the hexagonal number <code>X(m)</code> for some m.
 * @author Sean A. Irvine
 */
public class A252076 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252076() {
    super(new long[] {1, -1443, 1443}, new long[] {0, 486, 701100});
  }
}
