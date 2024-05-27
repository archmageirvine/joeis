package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069896 GCD of consecutive values of Chowla's function.
 * @author Sean A. Irvine
 */
public class A069896 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.CHOWLA.z(++mN).gcd(Functions.CHOWLA.z(mN + 1));
  }
}
