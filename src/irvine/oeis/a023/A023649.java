package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a002.A002808;

/**
 * A023649.
 * @author Sean A. Irvine
 */
public class A023649 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023649() {
    super(new A002808(), new SkipSequence(new A000045(), 2));
  }
}
