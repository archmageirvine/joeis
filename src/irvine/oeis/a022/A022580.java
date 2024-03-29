package irvine.oeis.a022;
// Generated by gen_seq4.pl genetfg at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;


/**
 * A022580 Expansion of Product_{m&gt;=1} (1+x^m)^15.
 * G.f.: <code>Product_{k&gt;=1} ((1+x^k)^15)</code>
 * @author Georg Fischer
 */
public class A022580 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A022580() {
    super(0, 1);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{Z.valueOf(-15)};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.NEG_ONE;
  }

}
