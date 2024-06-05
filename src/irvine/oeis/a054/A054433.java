package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054433 Numbers formed by interpreting the reduced residue set of every even number as a Zeckendorf Expansion.
 * @author Sean A. Irvine
 */
public class A054433 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    mN += 2;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; k += 2) {
      if (Functions.GCD.i(mN, k) == 1) {
        sum = sum.add(Functions.FIBONACCI.z(mN + 1 - k));
      }
    }
    return sum;
  }
}
