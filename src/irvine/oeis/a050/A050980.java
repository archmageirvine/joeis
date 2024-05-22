package irvine.oeis.a050;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050980 Haupt-exponents of 8 modulo integers relatively prime to 8.
 * @author Sean A. Irvine
 */
public class A050980 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    mN += 2;
    return Functions.ORDER.z(mN, Z.EIGHT);
  }
}
