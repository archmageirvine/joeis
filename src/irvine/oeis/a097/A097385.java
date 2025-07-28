package irvine.oeis.a097;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A097385 a(n) = (largest digit of n)^(smallest digit of n) + n.
 * @author Sean A. Irvine
 */
public class A097385 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.DIGIT_SORT_ASCENDING.z(++mN).mod(Z.TEN).pow(Functions.DIGIT_SORT_DESCENDING.l(mN) % 10).add(mN);
  }
}
