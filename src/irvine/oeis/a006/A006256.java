package irvine.oeis.a006;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a005.A005809;

/**
 * A006256 a(n) = Sum_{k=0..n} binomial(3*k,k)*binomial(3*n-3*k,n-k).
 * @author Sean A. Irvine
 */
public class A006256 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A006256() {
    super(new A005809());
  }
}
