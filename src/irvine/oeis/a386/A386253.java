package irvine.oeis.a386;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A386253 allocated for Mia Boudreau.
 * @author Sean A. Irvine
 */
public class A386253 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.DIGIT_SORT_DESCENDING.z(++mN).mod(Z.TEN).pow(Functions.DIGIT_SORT_ASCENDING.l(mN) % 10).add(mN);
  }
}
