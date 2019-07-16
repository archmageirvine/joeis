package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a014.A014306;
import irvine.oeis.a023.A023532;

/**
 * A024376.
 * @author Sean A. Irvine
 */
public class A024376 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024376() {
    super(new A023532(), new A014306());
  }
}
