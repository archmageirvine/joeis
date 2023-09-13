package irvine.oeis.a291;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A291556 Square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals: A(n,k) = (n!)^k * Sum_{i=1..n} 1/i^k.
 * @author Georg Fischer
 */
public class A291556 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A291556() {
    super(0, 0, -1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    // A(0, k) = 0, A(1, k) = 1, A(n+1, k) = (n^k+(n+1)^k)*A(n, k) - n^(2*k)*A(n-1, k)
    return (n == 0) ? Z.ZERO : ((k == 0) ? Z.valueOf(n) : Rationals.SINGLETON.sum(1, n, i
      -> new Q(Z.ONE, Z.valueOf(i).pow(k))).multiply(MemoryFactorial.SINGLETON.factorial(n).pow(k)).num());
  }
}
