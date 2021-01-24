package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038545 a(n) = Sum_{i=0..10^n} i^10.
 * @author Sean A. Irvine
 */
public class A038545 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(10);
    final Z n2 = mN.square();
    return Z.SIX.multiply(mN)
      .add(33).multiply(mN)
      .add(55).multiply(n2)
      .subtract(66).multiply(n2)
      .add(66).multiply(n2)
      .subtract(33).multiply(n2)
      .add(5).multiply(mN)
      .divide(66);
  }
}
