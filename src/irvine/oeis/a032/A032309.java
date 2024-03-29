package irvine.oeis.a032;
// Generated by gen_seq4.pl genetfg at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;


/**
 * A032309 "EFK" (unordered, size, unlabeled) transform of 2,4,6,8,...
 * G.f.: <code>Product_{k&gt;=1} ((1+2*k*x^k))</code>
 * @author Georg Fischer
 */
public class A032309 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A032309() {
    super(0, 1);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{Z.NEG_ONE};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.valueOf(2 * k).negate();
  }

}
