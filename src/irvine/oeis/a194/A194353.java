package irvine.oeis.a194;
// Generated by gen_seq4.pl genetf at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;


/**
 * A194353 G.f.: exp( Sum_{n&gt;=1} (x^n/n)/sqrt(1 - 4*x^n) ).
 * G.f.: <code>Product_{k&gt;=1} (1/(1-x^k)^binomial(2*k-2,k-1))</code>
 * @author Georg Fischer
 */
public class A194353 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A194353() {
    super(0, 1);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{irvine.math.z.Binomial.binomial(2 * k - 2, k - 1)};
  }
  
}
