package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;

/**
 * A055077 Multiplicity of Max{gcd(d, n!/d)} when d runs over the divisors of n!.
 * @author Sean A. Irvine
 */
public class A055077 extends A055460 implements Conjectural {

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(super.next().longValueExact());
  }
}

