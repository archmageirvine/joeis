package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a014.A014306;

/**
 * A023544 Convolution of natural numbers with <code>A014306</code>.
 * @author Sean A. Irvine
 */
public class A023544 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023544() {
    super(new A000027(), new SkipSequence(new A014306(), 1));
  }
}
