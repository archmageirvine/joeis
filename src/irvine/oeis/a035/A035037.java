package irvine.oeis.a035;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a004.A004011;

/**
 * A035037 Fourier coefficients of E_{gamma,2}^2*E_{0,4}.
 * @author Sean A. Irvine
 */
public class A035037 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A035037() {
    super(new A004011(), new A035036());
  }
}
