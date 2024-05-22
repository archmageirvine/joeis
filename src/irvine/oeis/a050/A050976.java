package irvine.oeis.a050;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050976 Haupt-exponents of 4 modulo integers relatively prime to 4.
 * @author Sean A. Irvine
 */
public class A050976 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    mN += 2;
    return Functions.ORDER.z(mN, Z.FOUR);
  }
}
