package irvine.oeis.a285;
// manually 2022-02-21

import irvine.math.z.Z;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A285243 Expansion of Product_{k&gt;=1} 1/(1 - k*x^(k^2))^k.
 * @author Georg Fischer
 */
public class A285243 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A285243() {
    super(0, 1);
    mNextH = advanceH(mKh);
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[] {Z.valueOf(mKh)};
  }

  @Override
  protected Z advanceG(final long k) {
    return Z.valueOf(mKh);
  }

  @Override
  protected Z advanceH(final long k) {
    return Z.valueOf(k * k);
  }
}
