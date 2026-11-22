package irvine.oeis.a228;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A228534 Triangular array read by rows: T(n,k) is the number of functional digraphs on {1,2,...,n} such that every element is mapped to a recurrent element and there are exactly k cycles, n&gt;=1, 1&lt;=k&lt;=n.
 * @author Gregory Morse
 */
public class A228534 extends Triangle {
  /** Construct the sequence. */
  public A228534() {
    setOffset(1);
  }

  @Override
  protected Z compute(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int j = k + 1; j <= n + 1; ++j) {
      sum = sum.add(Binomial.binomial(n + 1, j).multiply(Functions.STIRLING1.z(j, k + 1).abs()).multiply(Z.valueOf(j).pow(n + 1L - j)));
    }
    return sum;
  }
}
