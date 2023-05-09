package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A063718 a(n) is the smallest divisor of n^2 that is greater than n.
 * @author Sean A. Irvine
 */
public class A063718 extends Sequence2 {

  protected long mN = 1;

  @Override
  public Z next() {
    ++mN;
    for (final Z d : Jaguar.factor(mN * mN).divisorsSorted()) {
      if (d.longValueExact() > mN) {
        return d;
      }
    }
    throw new RuntimeException(); // cannot happen
  }
}

