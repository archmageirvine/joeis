package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005408;
import irvine.oeis.a023.A023532;

/**
 * A024372.
 * @author Sean A. Irvine
 */
public class A024372 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024372() {
    super(new A023532(), new PrependSequence(new A005408(), 0));
  }
}
