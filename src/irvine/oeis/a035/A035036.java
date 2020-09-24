package irvine.oeis.a035;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a004.A004011;

/**
 * A035036 Fourier coefficients of E_{gamma,2}*E_{0,4}.
 * @author Sean A. Irvine
 */
public class A035036 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A035036() {
    super(new A004011(), new A035016());
  }
}
