package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000984;

/**
 * A030979 Numbers n such that binomial(2n,n) is not divisible by 3, 5 or 7.
 * @author Sean A. Irvine
 */
public class A030979 extends A000984 {

  @Override
  public Z next() {
    Z t;
    do {
      t = super.next();
    } while (t.mod(3) == 0 || t.mod(5) == 0 || t.mod(7) == 0);
    return Z.valueOf(mN);
  }
}
