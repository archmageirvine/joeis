package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084115 A084113(n) minus A084114(n).
 * @author Sean A. Irvine
 */
public class A084115 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 1; // because 1 always subtracts 1
    Z prod = Z.ONE;
    for (final Z d : Jaguar.factor(++mN).divisorsSorted()) {
      if (prod.mod(d).isZero()) {
        prod = prod.divide(d);
        --cnt;
      } else {
        prod = prod.multiply(d);
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
