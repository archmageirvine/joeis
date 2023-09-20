package irvine.oeis.a153;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a001.A001008;

/**
 * A153357 Numbers n such that the harmonic number numerator A001008(n) is a semiprime.
 * @author Sean A. Irvine
 */
public class A153357 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A153357() {
    super(1, 1, new A001008(), SEMIPRIME);
  }
}
