package irvine.oeis.a209;
// manually convprom/convoseq at 2023-07-10 13:48

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000040;

/**
 * A209403 Convolution of primes with odd primes.
 * @author Georg Fischer
 */
public class A209403 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A209403() {
    super(1, new A000040(), new A000040().skip(1));
  }
}
