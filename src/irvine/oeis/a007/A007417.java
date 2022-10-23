package irvine.oeis.a007;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007417 If k appears, 3k does not.
 * @author Sean A. Irvine
 */
public class A007417 extends Sequence1 {

  private final HashSet<Z> mForbidden = new HashSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mForbidden.remove(mN)) {
        mForbidden.add(mN.multiply(3));
        return mN;
      }
    }
  }
}
