package irvine.oeis.a309;
// Generated by gen_seq4.pl genetfh at 2020-12-16 11:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;


/**
 * A309677 G.f. A(x) satisfies: A(x) = A(x^3) / (1 - x)^2.
 * G.f.: <code>Product_{k&gt;=0} (1/(1-x^(3^k))^2)</code>
 * @author Georg Fischer
 */
public class A309677 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A309677() {
    super(0, 0);
    mNextH = advanceH(mKh);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{Z.TWO};
  }

  @Override
  protected Z advanceH(final long k) {
    return Z.THREE.pow(k);
  }

}
