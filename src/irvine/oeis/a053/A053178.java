package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053178 Numbers ending in 1 which are not prime.
 * @author Sean A. Irvine
 */
public class A053178 implements Sequence {

  private Z mA = Z.valueOf(-9);

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

