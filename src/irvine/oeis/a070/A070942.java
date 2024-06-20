package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.a055.A055265;

/**
 * A070942 Values of n such that the first n terms of A055265 constitute a permutation of {1,2,3,...,n}.
 * @author Sean A. Irvine
 */
public class A070942 extends A055265 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      super.next();
      if (mSeen.last().intValueExact() == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
