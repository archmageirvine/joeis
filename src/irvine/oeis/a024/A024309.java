package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a000.A000045;

/**
 * A024309.
 * @author Sean A. Irvine
 */
public class A024309 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024309() {
    super(new A000027(), new A000045());
  }
}
