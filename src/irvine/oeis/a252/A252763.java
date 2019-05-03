package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252763 Numbers n such that the hexagonal number <code>H(n)</code> is equal to the sum of the pentagonal numbers <code>P(m), P(m+1), P(m+2)</code> and <code>P(m+3)</code> for some m.
 * @author Sean A. Irvine
 */
public class A252763 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252763() {
    super(new long[] {1, -195, 195}, new long[] {8, 1480, 287064});
  }
}
