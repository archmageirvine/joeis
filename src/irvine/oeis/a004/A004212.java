package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004212 Shifts one place left under 3rd-order binomial transform.
 * @author Sean A. Irvine
 */
public class A004212 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    Z t = Z.ONE;
    for (int k = 0; k <= mN; ++k) {
      s = s.add(t.multiply(Functions.STIRLING2.z(mN, mN - k)));
      t = t.multiply(3);
    }
    return s;
  }
}
