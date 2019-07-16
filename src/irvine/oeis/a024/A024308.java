package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a023.A023532;

/**
 * A024308.
 * @author Sean A. Irvine
 */
public class A024308 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024308() {
    super(new A000027(), new A023532());
  }
}
