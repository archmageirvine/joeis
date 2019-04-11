package irvine.oeis.a272;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A272999 Numbers k such that <code>(11*10^k + 49)/3</code> is prime.
 * @author Sean A. Irvine
 */
public class A272999 implements Sequence {

  private long mN = -1;
  private Z mA = Z.valueOf(11);

  @Override
  public Z next() {
    while (true) {
      if (++mN > 0) {
        mA = mA.multiply(10);
      }
      if (mA.add(49).divide(3).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
