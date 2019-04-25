package irvine.oeis.a006;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a005.A005809;

/**
 * A006256 <code>a(n) = Sum_{k=0..n} binomial(3k,k)*binomial(3n-3k,n-k)</code>.
 * @author Sean A. Irvine
 */
public class A006256 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A006256() {
    super(new A005809());
  }
}
