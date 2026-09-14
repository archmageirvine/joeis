package irvine.oeis.a260;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A260592 a(n) = binary odd/even encoding of the iterates in the modified Syracuse algorithm (msa) starting with 2n+1 and continuing up to (but not including) the first iterate less than 2n+1.
 * @author Sean A. Irvine
 */
public class A260592 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z k = Z.valueOf(2 * ++mN + 1);
    final Z n2 = Z.valueOf(2 * mN);
    Z res = Z.ZERO;
    while (k.compareTo(n2) > 0) {
      res = res.multiply(10);
      if (k.isOdd()) {
        k = k.multiply(3).add(1).divide2();
        res = res.add(1);
      } else {
        k = k.divide2();
      }
    }
    return res;
  }
}
