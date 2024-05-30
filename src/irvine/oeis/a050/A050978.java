package irvine.oeis.a050;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050978 Haupt-exponents of 6 modulo integers relatively prime to 6.
 * @author Sean A. Irvine
 */
public class A050978 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (Functions.GCD.l(++mN, 6) > 1) {
      // do nothing
    }
    return Functions.ORDER.z(mN, Z.SIX);
  }
}
