package irvine.oeis.a153;

import irvine.oeis.SemiprimeSequence;
import irvine.oeis.a001.A001008;

/**
 * A153357 Numbers n such that the Wolstenholme number <code>A001008(n)</code> is a semiprime.
 * @author Sean A. Irvine
 */
public class A153357 extends SemiprimeSequence {

  /** Construct the sequence. */
  public A153357() {
    super(new A001008(), 1);
  }
}
