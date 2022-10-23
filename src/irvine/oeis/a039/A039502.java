package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039502 Iterations of "n-&gt;n/2 if n even, n-&gt;3n-1 if n odd" (A001281) starting at these numbers reach 17.
 * @author Sean A. Irvine
 */
public class A039502 extends Sequence1 {

  private static final Z Z17 = Z.valueOf(17);
  private Z mN = Z.FOUR;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      Z m = mN;
      while (!Z.ONE.equals(m)) {
        if (Z.FIVE.equals(m)) {
          break;
        } else if (Z17.equals(m)) {
          return mN;
        }
        m = m.isEven() ? m.divide2() : m.multiply(3).subtract(1);
      }
    }
  }
}
