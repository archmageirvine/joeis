package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A074934.
 * @author Sean A. Irvine
 */
public class A074967 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final Z nn = Z.valueOf(++mN).pow(mN);
    long k = 0;
    while (true) {
      if (nn.subtract(++k).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
