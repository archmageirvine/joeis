package irvine.oeis.a036;

import irvine.oeis.FilterPositionSequence;

/**
 * A036415 Values of n for which there are no empty intervals when fractional part(m*phi) for m = 1, ..., n is plotted along [ 0, 1 ] subdivided into n equal regions.
 * @author Sean A. Irvine
 */
public class A036415 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A036415() {
    super(1, new A036414(), 0);
  }
}
