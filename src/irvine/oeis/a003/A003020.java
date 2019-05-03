package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002582;

/**
 * A003020 Largest prime factor of the "repunit" number <code>11...1 (cf. A002275)</code>.
 * @author Sean A. Irvine
 */
public class A003020 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.multiply(10).add(1);
    return A002582.lpf(mN);
  }
}
