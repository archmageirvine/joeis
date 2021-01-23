package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038388 Let f(n) be the smallest number such that the arithmetic mean (A) and geometric mean (G) of n and f(n) are both integers; sequence gives G values.
 * @author Sean A. Irvine
 */
public class A038388 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long k = 0;
    while (true) {
      final Z[] s;
      if (mN.add(++k).isEven() && (s = mN.multiply(k).sqrtAndRemainder())[1].isZero()) {
        return s[0];
      }
    }
  }
}
