package irvine.oeis.a070;
// Generated by gen_seq4.pl genetfg at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;


/**
 * A070877 Expansion of Product_{k&gt;=1} (1 - 2x^k).
 * G.f.: <code>Product_{k&gt;=1} ((1-2*x^k))</code>
 * @author Georg Fischer
 */
public class A070877 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A070877() {
    super(0, 1);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{Z.NEG_ONE};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.TWO;
  }

}
