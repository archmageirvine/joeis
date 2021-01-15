package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038387 a(n) is the smallest number such that the arithmetic mean (A) and geometric mean (G) of n and a(n) are both integers.
 * @author Sean A. Irvine
 */
public class A038387 implements Sequence {

  // After Andrew Howroyd

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long k = 0;
    while (true) {
      if (mN.add(++k).isEven() && mN.multiply(k).isSquare()) {
        return Z.valueOf(k);
      }
    }
  }
}
