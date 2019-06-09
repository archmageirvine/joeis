package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000204;
import irvine.oeis.a014.A014306;

/**
 * A023624 Convolution of Lucas numbers and <code>A014306</code>.
 * @author Sean A. Irvine
 */
public class A023624 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023624() {
    super(new A000204(), new SkipSequence(new A014306(), 1));
  }
}
