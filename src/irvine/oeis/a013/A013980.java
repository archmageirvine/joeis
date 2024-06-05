package irvine.oeis.a013;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A013980 Number of commutative elements in Coxeter group F_n.
 * @author Sean A. Irvine
 */
public class A013980 extends Sequence3 {

  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z res = Functions.FIBONACCI.z(3L * mN - 3);
    for (int k = 2; k < mN; ++k) {
      final Z t = Functions.FIBONACCI.z(3L * k - 4).multiply(Functions.CATALAN.z((long) (mN - k)));
      res = res.subtract(t);
    }
    res = res.multiply(5);
    res = res.add(Functions.CATALAN.z((long) (mN - 1)));
    res = res.subtract(Functions.FIBONACCI.z(2L * mN - 1).multiply2());
    res = res.subtract(Functions.FIBONACCI.z(2L * mN - 3).multiply2());
    res = res.add(Functions.FIBONACCI.z(mN));
    return res.subtract(1);
  }
}
