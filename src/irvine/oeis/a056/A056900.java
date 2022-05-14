package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056900 Numbers n where 36n^2+36n+11 is prime.
 * @author Sean A. Irvine
 */
public class A056900 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).square().multiply(36).add(36 * mN + 11);
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
