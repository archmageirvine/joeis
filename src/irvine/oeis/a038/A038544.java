package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038544 a(n) = Sum_{i=0..10^n} i^3.
 * @author Sean A. Irvine
 */
public class A038544 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.TEN.pow(++mN).add(1).square().multiply(Z.TEN.pow(2 * mN)).divide(4);
  }
}
