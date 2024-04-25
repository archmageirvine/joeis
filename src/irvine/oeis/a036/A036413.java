package irvine.oeis.a036;

import irvine.oeis.FilterPositionSequence;

/**
 * A036413 Values of k for which there are no empty intervals when fractional_part(m*e) for m = 1, ..., k is plotted along [ 0, 1 ] subdivided into k equal regions.
 * @author Sean A. Irvine
 */
public class A036413 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A036413() {
    super(1, new A036412(), 0);
  }
}
