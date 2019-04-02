package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000082 a(n) = n^2*Product_{p|n} (1 + 1/p).
 * @author Sean A. Irvine
 */
public class A000082 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z r = Z.valueOf(++mN).square();
    for (final Z t : Cheetah.factor(mN).toZArray()) {
      r = r.divide(t).multiply(t.add(1));
    }
    return r;
  }

}

