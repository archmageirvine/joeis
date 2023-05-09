package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A063717 a(n) is the greatest divisor of n^2 that is less than n.
 * @author Sean A. Irvine
 */
public class A063717 extends Sequence2 {

  protected long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z m = Z.ONE;
    for (final Z d : Jaguar.factor(mN * mN).divisorsSorted()) {
      if (d.longValueExact() >= mN) {
        break;
      }
      m = d;
    }
    return m;
  }
}

