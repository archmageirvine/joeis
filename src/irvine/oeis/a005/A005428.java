package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005428 a(n) = ceiling((1 + sum of preceding terms) / 2) starting with a(0) = 1.
 * @author Sean A. Irvine
 */
public class A005428 extends Sequence0 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z t = Z.ONE.add(mSum.divide2());
    mSum = mSum.add(t);
    return t;
  }
}
