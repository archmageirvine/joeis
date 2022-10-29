package irvine.oeis.a046;

import irvine.oeis.FilterPositionSequence;

/**
 * A046158 Values of n for which there are no empty intervals when frac(m gamma) for m = 1, ..., n is plotted along [ 0, 1 ] subdivided into n equal regions.
 * @author Sean A. Irvine
 */
public class A046158 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A046158() {
    super(1, new A046157(), 0);
  }
}
