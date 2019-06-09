package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a005.A005408;

/**
 * A023601.
 * @author Sean A. Irvine
 */
public class A023601 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023601() {
    super(new SkipSequence(new A023532(), 1), new A005408());
  }
}
