package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038574 Write n in ternary, sort digits into increasing order.
 * @author Sean A. Irvine
 */
public class A038574 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return Functions.DIGIT_SORT_ASCENDING.z(3, n);
  }
}
