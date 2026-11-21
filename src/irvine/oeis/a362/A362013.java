package irvine.oeis.a362;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A362013 Triangular array read by rows.  T(n,k) is the number of labeled directed graphs on [n] with exactly k strongly connected components of size 1 with outdegree zero, n&gt;=0, 0&lt;=k&lt;=n.
 * @author Gregory Morse
 */
public class A362013 extends Triangle {
  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : Binomial.binomial(n, k).multiply(Z.ONE.shiftLeft(n - 1).subtract(1).pow(n - k));
  }
}
