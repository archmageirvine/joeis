package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a003.A003422;

/**
 * A063508 Numbers n such that !n + 2n - 1 is prime.
 * @author Sean A. Irvine
 */
public class A063508 extends A003422 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().add(2 * mN + 1);
      if (t.isProbablePrime()) {
        return Z.valueOf(mN + 1);
      }
    }
  }
}
