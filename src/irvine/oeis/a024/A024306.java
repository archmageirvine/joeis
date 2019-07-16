package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000027;

/**
 * A024306.
 * @author Sean A. Irvine
 */
public class A024306 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024306() {
    super(new A000027(), new SkipSequence(new A000027(), 1));
  }
}
