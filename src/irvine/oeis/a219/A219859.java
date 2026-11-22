package irvine.oeis.a219;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A219859 Triangular array read by rows: T(n,k) is the number of endofunctions, functions f:{1,2,...,n}-&gt;{1,2,...,n}, that have exactly k elements with no preimage; n&gt;=0, 0&lt;=k&lt;=n.
 * @author Gregory Morse
 */
public class A219859 extends Triangle {
  @Override
  protected Z compute(final int n, final int k) {
    return Functions.FACTORIAL.z(n).divide(Functions.FACTORIAL.z(k)).multiply(Functions.STIRLING2.z(n, n - k));
  }
}
