package irvine.oeis.a089;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A089309 Write n in binary; a(n) = length of the rightmost run of 1's.
 * a(n) = if (n==0, 0, valuation(n/2^valuation(n, 2)+1, 2));
 * @author Georg Fischer
 */
public class A089309 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ZERO;
    }
    final int v2 = Functions.VALUATION.i(mN, Z.TWO);
    return Functions.VALUATION.z(mN / (1L << v2) + 1, 2);
  }
}
