package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a049.A049606;

/**
 * A055529 Number of bits needed in mantissa to express n! exactly.
 * @author Sean A. Irvine
 */
public class A055529 extends A049606 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().bitLength());
  }
}
