package irvine.oeis.a343;
// Generated by gen_seq4.pl genetm/genetfg at 2022-02-20 21:45

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A343366 Expansion of Product_{k&gt;=1} (1 + x^k)^(9^(k-1)).
 * G.f.: <code>Product_{k&gt;=1} ((1 + x^k)^(9^(k-1)).)</code>
 * @author Georg Fischer
 */
public class A343366 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A343366() {
    super(0, 1);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[] {Z.NINE.pow(k - 1).negate()};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.NEG_ONE;
  }

}
