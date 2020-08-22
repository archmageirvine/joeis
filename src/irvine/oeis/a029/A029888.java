package irvine.oeis.a029;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a001.A001285;

/**
 * A029888 Convolution of Thue-Morse sequence A001285 with primes.
 * @author Sean A. Irvine
 */
public class A029888 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A029888() {
    super(new A001285(), new A000040());
  }
}
