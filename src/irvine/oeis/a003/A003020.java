package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003020 Largest prime factor of the "repunit" number 11...1 (cf. A002275).
 * @author Sean A. Irvine
 */
public class A003020 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.multiply(10).add(1);
    return Jaguar.factor(mN).lpf();
  }
}
