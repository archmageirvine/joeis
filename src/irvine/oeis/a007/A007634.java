package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007634 Numbers n such that n^2 + n + 41 is composite.
 * @author Sean A. Irvine
 */
public class A007634 extends Sequence1 {

  protected Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.square().add(mN).add(41).isProbablePrime()) {
        return mN;
      }
    }
  }
}

