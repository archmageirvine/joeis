package irvine.oeis.a050;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050979 Haupt-exponents of 7 modulo integers relatively prime to 7.
 * @author Sean A. Irvine
 */
public class A050979 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    if (++mN % 7 == 0) {
      ++mN;
    }
    return Functions.ORDER.z(mN, Z.SEVEN);
  }
}
