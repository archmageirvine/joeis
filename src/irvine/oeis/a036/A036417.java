package irvine.oeis.a036;

import irvine.oeis.FilterPositionSequence;

/**
 * A036417 Values of k for which there are no empty intervals when fractional part(m*Pi) for m = 1, ..., k is plotted along [ 0, 1 ] subdivided into k equal regions.
 * @author Sean A. Irvine
 */
public class A036417 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A036417() {
    super(1, new A036416(), 0);
  }
}
