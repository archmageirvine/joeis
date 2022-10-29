package irvine.oeis.a036;

import irvine.oeis.FilterPositionSequence;

/**
 * A036413 Values of n for which there are no empty intervals when fractional_part(i E) for i = 1, ..., n is plotted along [ 0, 1 ] subdivided into n equal regions.
 * @author Sean A. Irvine
 */
public class A036413 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A036413() {
    super(1, new A036412(), 0);
  }
}
