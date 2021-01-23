package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037084 Positive integers not going to 1 under iterations of the map in A001281: n-&gt;3n-1 if n odd, n-&gt;n/2 if n even.
 * @author Sean A. Irvine
 */
public class A037084 implements Sequence {

  private static final Z Z17 = Z.valueOf(17);
  private Z mN = Z.FOUR;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      Z m = mN;
      while (!Z.ONE.equals(m)) {
        if (Z.FIVE.equals(m) || Z17.equals(m)) {
          return mN;
        }
        m = m.isEven() ? m.divide(2) : m.multiply(3).subtract(1);
      }
    }
  }
}
