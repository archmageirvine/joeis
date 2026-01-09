package irvine.oeis.a390;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a237.A237271;

/**
 * A083051.
 * @author Sean A. Irvine
 */
public class A390880 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A390880() {
    super(1, new A000027(), new A237271());
  }
}

