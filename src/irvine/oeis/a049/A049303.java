package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049303 Numbers n such that n is a substring of 5^n.
 * @author Sean A. Irvine
 */
public class A049303 implements Sequence {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(5);
      if (mT.toString().contains(String.valueOf(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
