package irvine.oeis.a050;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050981 Haupt-exponents of 9 modulo integers relatively prime to 9.
 * @author Sean A. Irvine
 */
public class A050981 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (LongUtils.gcd(++mN, 9) > 1) {
      // do nothing
    }
    return Functions.ORDER.z(mN, Z.NINE);
  }
}
