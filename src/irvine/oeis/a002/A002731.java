package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002731 Numbers n such that <code>(n^2 + 1)/2</code> is prime.
 * @author Sean A. Irvine
 */
public class A002731 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (mN.square().add(1).divide(2).isProbablePrime()) {
        return mN;
      }
    }
  }
}
