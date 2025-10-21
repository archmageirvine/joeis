package irvine.oeis.a389;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a054.A054474;

/**
 * A389637 Numerators of coefficients of 1- Pi/(2*EllipticK).
 * @author Sean A. Irvine
 */
public class A389637 extends A054474 {

  private long mN = -2;

  @Override
  public Z next() {
    mN += 4;
    return mN == 2 ? super.next().subtract(1) : new Q(super.next(), Z.ONE.shiftLeft(mN)).num();
  }
}

