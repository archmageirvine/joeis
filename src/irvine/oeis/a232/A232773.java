package irvine.oeis.a232;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Stirling;
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
        .multiply(Stirling.firstKind(mN, mN - k))
        .multiply(Stirling.firstKind(mN + 1, k + 1))
        .multiply(MemoryFactorial.SINGLETON.factorial(mN - k))
        .multiply(MemoryFactorial.SINGLETON.factorial(k))
        .multiply(((mN & 1) == 0) ? 1 : -1));
    }
    return sum;
  }
}
