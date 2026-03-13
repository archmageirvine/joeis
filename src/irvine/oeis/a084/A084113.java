package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084113 Number of multiplications when calculating A084110(n).
 * @author Sean A. Irvine
 */
public class A084113 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    Z prod = Z.ONE;
    for (final Z d : Jaguar.factor(++mN).divisorsSorted()) {
      if (prod.mod(d).isZero()) {
        prod = prod.divide(d);
      } else {
        prod = prod.multiply(d);
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
