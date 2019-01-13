package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002808.
 * @author Sean A. Irvine
 */
public class A002808 implements Sequence {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isPrime()) {
        return mN;
      }
    }
  }
}

