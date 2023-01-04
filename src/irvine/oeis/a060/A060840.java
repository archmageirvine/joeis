package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060840 Number of irreducible representations of symmetric group S_n whose degree is not divisible by 3.
 * @author Sean A. Irvine
 */
public class A060840 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z res = Z.ONE;
    long n = ++mN;
    Z t = Z.ONE;
    while (n != 0) {
      switch ((int) (n % 3)) {
        case 1:
          res = res.multiply(t);
          break;
        case 2:
          res = res.multiply(t).multiply(t.add(3).divide2());
          break;
        default:
          break;
      }
      n /= 3;
      t = t.multiply(3);
    }
    return res;
  }
}
