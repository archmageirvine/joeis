package irvine.oeis.a022;
// Generated by gen_seq4.pl genetfg at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;


/**
 * A022631 Expansion of Product_{m&gt;=1} (1 + m*q^m)^3.
 * G.f.: <code>Product_{k&gt;=1} ((1+k*x^k)^3)</code>
 * @author Georg Fischer
 */
public class A022631 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A022631() {
    super(0, 1);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{Z.valueOf(-3)};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.valueOf(k).negate();
  }

}
