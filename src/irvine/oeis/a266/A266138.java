package irvine.oeis.a266;
// manually 2022-02-21

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A266138 Expansion of Product_{k>=1} 1/(1 - k*(x^(2*k+1))).
 * @author Georg Fischer
 */
public class A266138 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A266138() {
    super(0, 1);
    mNextH = advanceH(mKh);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[] {Z.ONE};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.valueOf(mKh);
  }

  @Override
  protected Z advanceH(final long k) {
    return Z.valueOf(2 * k + 1);
  }
}
