package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039501 Iterations of "n-&gt;n/2 if n even, n-&gt;3n-1 if n odd" (A001281) starting at these numbers reach 5.
 * @author Sean A. Irvine
 */
public class A039501 implements Sequence {

  private static final Z Z17 = Z.valueOf(17);
  private Z mN = Z.FOUR;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      Z m = mN;
      while (!Z.ONE.equals(m)) {
        if (Z.FIVE.equals(m)) {
          return mN;
        } else if (Z17.equals(m)) {
          break;
        }
        m = m.isEven() ? m.divide(2) : m.multiply(3).subtract(1);
      }
    }
  }
}
