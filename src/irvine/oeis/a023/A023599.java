package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002808;

/**
 * A023599.
 * @author Sean A. Irvine
 */
public class A023599 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023599() {
    super(new SkipSequence(new A023532(), 1), new A002808());
  }
}
