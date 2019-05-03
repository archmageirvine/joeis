package irvine.oeis.a006;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000129;

/**
 * A006645 Self-convolution of Pell numbers <code>(A000129)</code>.
 * @author Sean A. Irvine
 */
public class A006645 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A006645() {
    super(new A000129());
  }
}
