package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;

/**
 * A023604.
 * @author Sean A. Irvine
 */
public class A023604 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023604() {
    super(new SkipSequence(new A023532(), 1), new SkipSequence(new A023533(), 1));
  }
}
