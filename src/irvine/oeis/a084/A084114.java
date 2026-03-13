package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084114 Number of divisions when calculating A084110(n).
 * @author Sean A. Irvine
 */
public class A084114 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = -1; // because 1 always adds 1
    Z prod = Z.ONE;
    for (final Z d : Jaguar.factor(++mN).divisorsSorted()) {
      if (prod.mod(d).isZero()) {
        prod = prod.divide(d);
        ++cnt;
      } else {
        prod = prod.multiply(d);
      }
    }
    return Z.valueOf(cnt);
  }
}
