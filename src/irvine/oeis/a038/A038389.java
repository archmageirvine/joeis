package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038389 Let f(n) be the smallest number such that the arithmetic mean (A) and geometric mean (G) of n and f(n) are both integers; sequence gives A values.
 * @author Sean A. Irvine
 */
public class A038389 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long k = 0;
    while (true) {
      final Z a;
      if ((a = mN.add(++k)).isEven() && mN.multiply(k).isSquare()) {
        return a.divide2();
      }
    }
  }
}
