package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a003.A003593;

/**
 * A022337 Exponent of 5 (value of j) in n-th number of form 3^i*5^j.
 * @author Sean A. Irvine
 */
public class A022337 extends A003593 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.valuation(Z.FIVE, super.next()));
  }
}
