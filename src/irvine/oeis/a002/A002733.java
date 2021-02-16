package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002733 Numbers k such that (k^2 + 1)/10 is prime.
 * @author Sean A. Irvine
 */
public class A002733 implements Sequence {

  private Z mN = Z.THREE;
  private int mAdd = 4;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(mAdd);
      mAdd = 10 - mAdd;
      if (mN.square().add(1).divide(10).isProbablePrime()) {
        return mN;
      }
    }
  }
}
