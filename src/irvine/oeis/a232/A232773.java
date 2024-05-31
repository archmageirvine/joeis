package irvine.oeis.a232;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A232773 Permanent of the n X n matrix with numbers 1,2,...,n^2 in order across rows.
 * @author Georg Fischer
 */
public class A232773 extends Sequence0 {

  private int mN = -1;
  
  /** Construct the sequence. */
  public A232773() {
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    // a(n) = (-1)^n * Sum_{k=0..n} n^k * Stirling1(n,n-k) * Stirling1(n+1,k+1) * (n-k)! * k!.
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(mN).pow(k)
        .multiply(Functions.STIRLING1.z(mN, mN - k))
        .multiply(Functions.STIRLING1.z(mN + 1, k + 1))
        .multiply(Functions.FACTORIAL.z(mN - k))
        .multiply(Functions.FACTORIAL.z(k))
        .multiply(((mN & 1) == 0) ? 1 : -1));
    }
    return sum;
  }
}
