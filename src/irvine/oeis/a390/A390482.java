package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390482 Least integer k such that (2^n*k)^2+1 is prime, or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A390482 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Z.ONE.shiftLeft(++mN);
    long k = 0;
    while (true) {
      if (t.multiply(++k).square().add(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
