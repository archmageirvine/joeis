package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;

/**
 * A023613.
 * @author Sean A. Irvine
 */
public class A023613 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023613() {
    super(new SkipSequence(new A000045(), 1), new SkipSequence(new A023533(), 1));
  }
}
