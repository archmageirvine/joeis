package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160695 <code>a(n)</code> such that <code>3*a(n)+1</code> and <code>7*a(n)+1</code> are both perfect squares.
 * @author Sean A. Irvine
 */
public class A160695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160695() {
    super(new long[] {1, -24, 24}, new long[] {0, 5, 120});
  }
}
