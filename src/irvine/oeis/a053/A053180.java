package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053180 Numbers ending in 7 which are not prime.
 * @author Sean A. Irvine
 */
public class A053180 implements Sequence {

  private Z mA = Z.valueOf(17);

  @Override
  public Z next() {
    while (true) {
      mA = mA.add(10);
      if (!mA.isProbablePrime()) {
        return mA;
      }
    }
  }
}

