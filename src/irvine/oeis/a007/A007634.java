package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007634 Numbers n such that <code>n^2 + n + 41</code> is composite.
 * @author Sean A. Irvine
 */
public class A007634 implements Sequence {

  private Z mN = Z.ONE;

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

