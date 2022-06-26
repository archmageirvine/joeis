package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A057708 Numbers m such that 2^m reversed is prime.
 * @author Sean A. Irvine
 */
public class A057708 implements Sequence {

  private int mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply2();
      if (ZUtils.reverse(mA).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
