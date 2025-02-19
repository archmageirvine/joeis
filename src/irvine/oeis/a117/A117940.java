package irvine.oeis.a117;
// manually 2025-02-18

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A117940 a(0)=1, thereafter a(3n) = a(3n+1)/3 = a(n), a(3n+2)=0.
 * G.f.: <code>Product_{k&gt;=0} ((1+3*x^(3^k)))</code>
 * @author Georg Fischer
 */
public class A117940 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A117940() {
    super(0, 0);
    mNextH = advanceH(mKh);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{Z.NEG_ONE};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.THREE.negate();
  }

  @Override
  protected Z advanceH(final long k) {
    return Z.THREE.pow(k);
  }

}
