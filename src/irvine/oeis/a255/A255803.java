package irvine.oeis.a255;
// Generated by gen_seq4.pl genetf at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;


/**
 * A255803 G.f.: Product_{k&gt;=1} 1/(1-x^k)^(3*k+2).
 * G.f.: <code>Product_{k&gt;=1} (1/(1-x^k)^(3*k+2))</code>
 * @author Georg Fischer
 */
public class A255803 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A255803() {
    super(0, 1);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{Z.valueOf(3 * k + 2)};
  }

}
