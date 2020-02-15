package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002582;

/**
 * A003021 Largest prime factor of <code>10^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A003021 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(10);
    return A002582.lpf(mN.add(1));
  }
}
