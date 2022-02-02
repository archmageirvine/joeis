package irvine.oeis.a054;

import irvine.math.IntegerUtils;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054433 Numbers formed by interpreting the reduced residue set of every even number as a Zeckendorf Expansion.
 * @author Sean A. Irvine
 */
public class A054433 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    mN += 2;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; k += 2) {
      if (IntegerUtils.gcd(mN, k) == 1) {
        sum = sum.add(Fibonacci.fibonacci(mN + 1 - k));
      }
    }
    return sum;
  }
}
