package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000082 a(n) = n^2*Product_{p|n} (1 + 1/p).
 * @author Sean A. Irvine
 */
public class A000082 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    Z r = Z.valueOf(++mN).square();
    for (final Z t : Jaguar.factor(mN).toZArray()) {
      r = r.divide(t).multiply(t.add(1));
    }
    return r;
  }

}

