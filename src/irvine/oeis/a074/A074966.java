package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074934.
 * @author Sean A. Irvine
 */
public class A074966 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z nn = Z.valueOf(++mN).pow(mN);
    long k = 0;
    while (true) {
      if (nn.add(++k).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
