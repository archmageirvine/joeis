package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073842 a(1) = 1; for n&gt;1, a(n) = the smallest positive integer root of n not included earlier, if such a root exists, otherwise the smallest power of n not included earlier, subject to a(n)&lt;&gt;n.
 * @author Sean A. Irvine
 */
public class A073842 extends Sequence1 {

  // After Franklin T. Adams-Watters

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long k = 0;
    Z m = Z.valueOf(mN);
    while (true) {
      final Z[] r = m.sqrtAndRemainder();
      if (!r[1].isZero()) {
        break;
      }
      ++k;
      m = r[0];
    }
    if ((k & 1) == 0) {
      return m.pow(Z.TWO.pow(k + 1));
    } else {
      return m.pow(Z.TWO.pow(k - 1));
    }
  }
}
