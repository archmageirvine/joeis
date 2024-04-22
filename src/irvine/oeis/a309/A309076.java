package irvine.oeis.a309;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A309076 The Zeckendorf representation of n read as a NegaFibonacci representation.
 * @author Sean A. Irvine
 */
public class A309076 extends Sequence0 {

  private static final CR LN_PHI = CR.PHI.log();
  private static final CR SQRT5 = CR.FIVE.sqrt();
  private long mN = -1;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    long n = ++mN;
    while (n > 0) {
      final int k = SQRT5.multiply(n).add(CR.HALF).log().divide(LN_PHI).floor().intValueExact();
      n -= Functions.FIBONACCI.l(k);
      sum = sum.add(Functions.FIBONACCI.z(1 - k));
    }
    return sum;
  }
}
