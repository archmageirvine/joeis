package irvine.oeis.a004;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004213 Shifts one place left under 4th-order binomial transform.
 * @author Sean A. Irvine
 */
public class A004213 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    Z t = Z.ONE;
    for (int k = 0; k <= mN; ++k) {
      s = s.add(t.multiply(Stirling.secondKind(mN, mN - k)));
      t = t.shiftLeft(2);
    }
    return s;
  }
}
