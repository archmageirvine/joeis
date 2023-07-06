package irvine.oeis.a042;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a018.A018218;

/**
 * A042940 Convolution of Catalan numbers A000108(n+1), n &gt;= 0, with A038846.
 * @author Sean A. Irvine
 */
public class A042940 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A042940() {
    super(new A018218().skip(1));
  }
}
