package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002732 Numbers k such that (4*k^2 + 1)/5 is prime.
 * @author Sean A. Irvine
 */
public class A002732 extends Sequence1 {

  private Z mN = Z.ONE;
  private int mAdd = 3;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(mAdd);
      mAdd = 5 - mAdd;
      if (mN.square().shiftLeft(2).add(1).divide(5).isProbablePrime()) {
        return mN;
      }
    }
  }
}
