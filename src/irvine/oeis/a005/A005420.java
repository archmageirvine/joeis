package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A005420 Largest prime factor of 2^n - 1.
 * @author Sean A. Irvine
 */
public class A005420 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    final Z[] p = Jaguar.factor(Z.ONE.shiftLeft(mN).subtract(1)).toZArray();
    return p[p.length - 1];
  }
}
