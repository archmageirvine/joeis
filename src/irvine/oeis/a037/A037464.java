package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037464 Bisection of A076605.
 * @author Sean A. Irvine
 */
public class A037464 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    final Z[] p = Jaguar.factor(mN * mN - 1).toZArray();
    return p[p.length - 1];
  }
}
