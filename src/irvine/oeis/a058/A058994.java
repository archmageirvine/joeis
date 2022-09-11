package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A058994 Numbers m such that 7^m reversed is prime.
 * @author Sean A. Irvine
 */
public class A058994 implements Sequence {

  private Z mA = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(7);
      if (ZUtils.reverse(mA).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
