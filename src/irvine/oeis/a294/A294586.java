package irvine.oeis.a294;
// Generated by gen_seq4.pl genetfg at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;


/**
 * A294586 Expansion of Product_{k&gt;=1} 1/(1 - k^2*x^k)^(k^2).
 * G.f.: <code>Product_{k&gt;=1} (1/(1-k*k*x^k)^(k*k))</code>
 * @author Georg Fischer
 */
public class A294586 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A294586() {
    super(0, 1);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{Z.valueOf(k * k)};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.valueOf(k * k);
  }

}
