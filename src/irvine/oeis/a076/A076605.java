package irvine.oeis.a076;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A076605 Largest prime divisor of n^2 - 1.
 * @author Sean A. Irvine
 */
public class A076605 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final Z[] p = Jaguar.factor(++mN * mN - 1).toZArray();
    return p[p.length - 1];
  }
}
