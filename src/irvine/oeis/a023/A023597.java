package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000204;

/**
 * A023597.
 * @author Sean A. Irvine
 */
public class A023597 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023597() {
    super(new SkipSequence(new A023532(), 1), new A000204());
  }
}
