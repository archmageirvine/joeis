package irvine.oeis.a082;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A082183 Smallest k &gt; 0 such that T(n) + T(k) = T(m), for some m, T(i) being the triangular numbers, n &gt; 1.
 * @author Sean A. Irvine
 */
public class A082183 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mN).multiply(mN + 1);
    final Z[] div = Jaguar.factor(t).divisorsSorted();
    for (int k = div.length / 2 - 2; k >= 0; --k) {
      final Z x = div[k];
      final Z y = t.divide(x);
      final Z d = y.subtract(x);
      if (d.isOdd()) {
        return d.divide2();
      }
    }
    return Z.NEG_ONE;
  }
}
