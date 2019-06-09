package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a014.A014306;

/**
 * A023605 Convolution of <code>A023532</code> and <code>A014306</code>.
 * @author Sean A. Irvine
 */
public class A023605 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023605() {
    super(new SkipSequence(new A023532(), 1), new SkipSequence(new A014306(), 1));
  }
}
