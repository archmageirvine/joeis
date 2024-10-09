package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072523.
 * @author Sean A. Irvine
 */
public class A072524 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z f = Functions.TRIANGULAR.z(++mN);
    Z sum = Z.ZERO;
    for (int k = 2; k < mN; ++k) {
      sum = sum.add(f.mod(Functions.TRIANGULAR.z(k)));
    }
    return sum;
  }
}
