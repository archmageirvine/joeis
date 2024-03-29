package irvine.oeis.a319;
// Generated by gen_seq4.pl genetg at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;


/**
 * A319110 Expansion of Product_{k&gt;=1} 1/(1 - (k - 1)*x^k).
 * G.f.: <code>Product_{k&gt;=1} (1/(1-(k-1)*x^k))</code>
 * @author Georg Fischer
 */
public class A319110 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A319110() {
    super(0, 1);
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.valueOf(k - 1);
  }

}
