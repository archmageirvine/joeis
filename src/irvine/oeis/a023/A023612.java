package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a001.A001950;

/**
 * A023612.
 * @author Sean A. Irvine
 */
public class A023612 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023612() {
    super(new SkipSequence(new A000045(), 1), new A001950());
  }
}
