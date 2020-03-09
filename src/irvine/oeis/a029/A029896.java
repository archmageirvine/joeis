package irvine.oeis.a029;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a001.A001285;
import irvine.oeis.a008.A008578;

/**
 * A029896 Convolution of Thue-Morse sequence <code>A001285</code> with <code>A008578 = {1</code>, primes}.
 * @author Sean A. Irvine
 */
public class A029896 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A029896() {
    super(new A001285(), new A008578());
  }
}
