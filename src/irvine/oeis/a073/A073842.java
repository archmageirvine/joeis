package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073828.
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
