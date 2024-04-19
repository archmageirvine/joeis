package irvine.oeis.a002;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002119 Bessel polynomial y_n(-2).
 * @author Sean A. Irvine
 */
public class A002119 extends Sequence0 {

  private int mN = -1;


  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      final Z t = Functions.FACTORIAL.z(2 * mN - k).divide(Functions.FACTORIAL.z(k)).divide(Functions.FACTORIAL.z(mN - k));
      if (((mN - k) & 1) == 0) {
        s = s.add(t);
      } else {
        s = s.subtract(t);
      }
    }
    return s;
  }
}
