package irvine.oeis.a294;
// Generated by gen_seq4.pl genetfg at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;


/**
 * A294844 Expansion of Product_{k&gt;=1} (1 + x^k)^(k*(k+1)*(5*k-2)/6).
 * G.f.: <code>Product_{k&gt;=1} ((1+x^k)^(k*(k+1)*(5*k-2)/6))</code>
 * @author Georg Fischer
 */
public class A294844 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A294844() {
    super(0, 1);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{Z.valueOf(-(k * (k + 1) * (5 * k - 2) / 6))};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.NEG_ONE;
  }

}
