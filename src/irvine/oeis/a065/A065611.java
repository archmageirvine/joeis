package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065611 Let k be the least integer such that n^2 + Sum_{m=1..k} m^2 is a perfect square, then a(n) is the resulting square.
 * @author Sean A. Irvine
 */
public class A065611 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z s = Z.valueOf(++mN).square();
    long k = 0;
    while (true) {
      final Z t = s.add(Z.valueOf(++k).multiply(k + 1).multiply(2 * k + 1).divide(6));
      if (t.isSquare()) {
        return t;
      }
    }
  }
}
