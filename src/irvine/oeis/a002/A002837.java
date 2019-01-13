package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002837.
 * @author Sean A. Irvine
 */
public class A002837 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().subtract(mN).add(41).isProbablePrime()) {
        return mN;
      }
    }
  }
}

