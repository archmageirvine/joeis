package irvine.oeis.a029;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a001.A001285;

/**
 * A029886 Convolution of Thue-Morse sequence A001285 with itself.
 * @author Sean A. Irvine
 */
public class A029886 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A029886() {
    super(new A001285());
  }
}
